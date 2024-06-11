package com.example.product_mongoDB.Repository;

import com.example.product_mongoDB.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{

}

