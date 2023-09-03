package com.josepillado.arquitecturasmodernas.cqrs.mongo.repository;

import com.josepillado.arquitecturasmodernas.cqrs.mongo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
