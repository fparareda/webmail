package com.demo.web.domain.model.email;

public interface EmailRepository {
    Iterable<Email> findAll();
    Email findById(String id);
    Email save(Email email);
    void delete(Email email);
}
