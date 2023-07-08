package io.github.brunoonofre64.jspproject.domain.exceptions;


import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;

public class RoleAlreadyExistsException extends RuntimeException{

    final CodeMessage message;

    public RoleAlreadyExistsException(CodeMessage message) {
        this. message = message;
    }

    @Override
    public String getMessage() {
        return message.toString();
    }
}
