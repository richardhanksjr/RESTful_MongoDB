package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "task", path = "task")
public interface TestRepository extends MongoRepository<Task, String> {

}
