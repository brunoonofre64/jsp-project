package io.github.brunoonofre64.jspproject.domain.exceptions;


import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;

public class GameListNotFoundException extends RuntimeException {

    final CodeMessage message;

    public GameListNotFoundException(CodeMessage message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.toString();
    }
}
