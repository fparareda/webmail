package com.demo.web.controller.api;

import com.demo.web.NotValidException;
import com.demo.web.domain.model.email.Email;
import com.demo.web.domain.model.email.EmailNotValidException;
import com.demo.web.dto.EmailDto;
import com.demo.web.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class EmailApiController {

    private EmailService emailService;

    @Autowired
    public EmailApiController(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping("emails")
    @ResponseBody
    public Iterable<Email> list() {
        return null;
    }

    @PostMapping("emails")
    @ResponseBody
    public Email create() throws EmailNotValidException {
        emailService.create(new EmailDto("aaaa"));
        return null;
    }

    @ExceptionHandler(NotValidException.class)
    public ExceptionApiResponse notValidException(NotValidException notValidException) {
        return new ExceptionApiResponse(notValidException.getErrors());
    }
}
