package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    //@ non_null
    private static final String MESSAGE = "Hello World!";

    //@ invariant MESSAGE != null && MESSAGE instanceof CharSequence;

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

//    public String getMessage() {
//        return MESSAGE;
//    }
}
