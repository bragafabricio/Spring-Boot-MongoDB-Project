package com.fabricio.projectmongodb.repository;

import com.fabricio.projectmongodb.domain.Post;
import com.fabricio.projectmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
