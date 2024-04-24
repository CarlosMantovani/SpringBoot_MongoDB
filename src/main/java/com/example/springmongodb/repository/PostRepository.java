package com.example.springmongodb.repository;

import com.example.springmongodb.domain.Post;
import com.example.springmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
