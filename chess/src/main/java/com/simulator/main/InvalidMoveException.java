package com.simulator.main;

public class InvalidMoveException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InvalidMoveException(String message) {
        super(message);
    }
}