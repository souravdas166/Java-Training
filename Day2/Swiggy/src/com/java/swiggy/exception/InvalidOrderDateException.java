package com.java.swiggy.exception;

public class InvalidOrderDateException extends Exception {
    
    // Constructor accepting an error message
    public InvalidOrderDateException(String error) {
        super(error);  // Call the superclass constructor with the error message
    }
}
