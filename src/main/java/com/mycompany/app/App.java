package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    //@ non_null
    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    //@ ensures \result != null;
    public String getMessage() {
        return MESSAGE;
    }
}
