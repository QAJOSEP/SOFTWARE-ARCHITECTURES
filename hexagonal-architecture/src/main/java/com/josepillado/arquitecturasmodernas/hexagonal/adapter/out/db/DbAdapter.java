package com.josepillado.arquitecturasmodernas.hexagonal.adapter.out.db;

import com.josepillado.arquitecturasmodernas.hexagonal.adapter.out.db.model.TennisMatchEntity;
import com.josepillado.arquitecturasmodernas.hexagonal.adapter.out.db.repository.DbRepository;
import com.josepillado.arquitecturasmodernas.hexagonal.application.dto.TennisMatchDTO;
import com.josepillado.arquitecturasmodernas.hexagonal.port.out.db.DbPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbAdapter implements DbPort {

  @Autowired
  private DbRepository dbRepository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public void upsertMatch(TennisMatchDTO match) {
    TennisMatchEntity entity = modelMapper.map(match, TennisMatchEntity.class);
    dbRepository.save(entity);
  }

  @Override
  public void updateStatus(String matchId, String status) {
    TennisMatchEntity entity = dbRepository.getById(matchId);
    entity.setStatus(status);
    dbRepository.save(entity);
  }
}
