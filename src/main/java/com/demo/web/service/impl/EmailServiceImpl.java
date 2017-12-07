package com.demo.web.service.impl;

import com.demo.web.domain.model.email.Email;
import com.demo.web.domain.model.email.EmailNotValidException;
import com.demo.web.domain.model.email.EmailRepository;
import com.demo.web.dto.EmailDto;
import com.demo.web.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Service
public class EmailServiceImpl implements EmailService {

    private EmailRepository emailRepository;
    private Validator validator;

    @Autowired
    public EmailServiceImpl(EmailRepository emailRepository, Validator validator) {
        this.emailRepository = emailRepository;
        this.validator = validator;
    }

    @Override
    public Iterable<Email> getAll() {
        return emailRepository.findAll();
    }

    @Override
    public Email getById(String id) {
        return null;
    }

    @Override
    public Email create(EmailDto emailDto) {
        Email email = new Email("ABC", "john.doe@gmail.com");
        Set<ConstraintViolation<Email>> errors = validator.validate(email);
        if (!errors.isEmpty()) {
            //throw new EmailNotValidException(new Errors(errors));
        }
        return null;
    }

    @Override
    public Email update(EmailDto emailDto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
