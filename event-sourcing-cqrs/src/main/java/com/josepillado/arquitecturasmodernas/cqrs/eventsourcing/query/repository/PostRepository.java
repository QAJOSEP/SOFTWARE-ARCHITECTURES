package com.josepillado.arquitecturasmodernas.cqrs.eventsourcing.query.repository;

import com.josepillado.arquitecturasmodernas.cqrs.eventsourcing.query.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
