package io.github.brunoonofre64.jspproject.domain.exceptions;


import io.github.brunoonofre64.jspproject.domain.enums.CodeMessage;

public class UsernameAlreadyExists extends RuntimeException {

    final CodeMessage message;

    public UsernameAlreadyExists(CodeMessage message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.toString();
    }
}
