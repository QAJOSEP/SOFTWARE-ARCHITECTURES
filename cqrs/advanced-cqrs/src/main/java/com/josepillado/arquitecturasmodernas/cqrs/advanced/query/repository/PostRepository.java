package com.josepillado.arquitecturasmodernas.cqrs.advanced.query.repository;

import com.josepillado.arquitecturasmodernas.cqrs.advanced.query.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
