package com.demo.web.repository;

import com.demo.web.domain.model.email.Email;
import com.demo.web.domain.model.email.EmailRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoEmailRepository extends CrudRepository<Email, String>, EmailRepository {
}
