package com.demo.web.controller.api;

import java.util.Set;

public class ExceptionApiResponse {

    private Set<Error> errors;

    public ExceptionApiResponse(Set<Error> errors) {
        this.errors = errors;
    }

    public Set<Error> getErrors() {
        return errors;
    }
}
