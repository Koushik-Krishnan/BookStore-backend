package com.project.bookstore.exceptinHandeling;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException(String message){
        super(message);
    }

}
