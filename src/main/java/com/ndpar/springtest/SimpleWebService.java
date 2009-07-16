package com.ndpar.springtest;

public class SimpleWebService implements WebService {

    public String call(String request) {
        return "Processed " + request;
    }
}
