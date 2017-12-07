package com.demo.web.service;

import com.demo.web.domain.model.email.Email;
import com.demo.web.domain.model.email.EmailNotValidException;
import com.demo.web.dto.EmailDto;

public interface EmailService {
    Iterable<Email> getAll();
    Email getById(String id);
    Email create(EmailDto emailDto) throws EmailNotValidException;
    Email update(EmailDto emailDto);
    void delete(String id);
}
