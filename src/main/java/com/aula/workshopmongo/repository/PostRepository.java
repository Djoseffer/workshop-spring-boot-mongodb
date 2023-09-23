package com.aula.workshopmongo.repository;

import com.aula.workshopmongo.domain.Post;
import com.aula.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}