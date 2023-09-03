package com.josepillado.arquitecturasmodernas.cqrs.postgres.command.repository;

import com.josepillado.arquitecturasmodernas.cqrs.postgres.command.model.PostCommand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommandRepository extends CrudRepository<PostCommand, Long> {

}
