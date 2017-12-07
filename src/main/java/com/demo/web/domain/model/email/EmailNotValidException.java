package com.demo.web.domain.model.email;

import com.demo.web.NotValidException;

import java.util.Set;

public class EmailNotValidException extends NotValidException {

    public EmailNotValidException(Set<Error> errors) {
        super(errors);
    }
}
