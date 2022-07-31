package com.nghia.rent_book.exception;

public class NotEnoughBookException extends Exception{
    @Override
    public String getMessage(){
        return "Book is not available";
    }
}
