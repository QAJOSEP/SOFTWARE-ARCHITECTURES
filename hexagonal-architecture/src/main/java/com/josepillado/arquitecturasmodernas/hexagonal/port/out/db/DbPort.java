package com.josepillado.arquitecturasmodernas.hexagonal.port.out.db;

import com.josepillado.arquitecturasmodernas.hexagonal.application.dto.TennisMatchDTO;

public interface DbPort {

  void upsertMatch(TennisMatchDTO match);

  void updateStatus(String matchId, String status);

}
