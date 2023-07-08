package io.github.brunoonofre64.jspproject.domain.exceptions;


import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;

public class EmptyListException extends RuntimeException {

    final CodeMessage message;

    public EmptyListException(CodeMessage message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.toString();
    }
}
