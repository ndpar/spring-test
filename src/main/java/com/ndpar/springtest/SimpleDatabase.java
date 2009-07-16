package com.ndpar.springtest;

public class SimpleDatabase implements Database {

    public String persist(String data) {
        return "Persisted " + data;
    }
}
