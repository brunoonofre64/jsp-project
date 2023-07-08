package io.github.brunoonofre64.jspproject.domain.exceptions;


import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;

public class RoleEmptyException extends RuntimeException {

    final CodeMessage message;

    public RoleEmptyException(CodeMessage message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.toString();
    }
}
