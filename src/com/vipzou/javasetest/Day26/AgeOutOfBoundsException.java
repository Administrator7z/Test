package com.vipzou.javasetest.Day26;

public class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException(String message) {
        super(message);
    }

    public AgeOutOfBoundsException() {
        super();
    }
}
