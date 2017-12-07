package com.demo.web;

import java.util.Set;

public class NotValidException extends Exception {

    private Set<Error> errors;

    public NotValidException(Set<Error> errors) {
        this.errors = errors;
    }

    public Set<Error> getErrors() {
        return errors;
    }
}
