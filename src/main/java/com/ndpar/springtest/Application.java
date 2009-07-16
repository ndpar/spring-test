package com.ndpar.springtest;

import org.springframework.beans.factory.annotation.Autowired;

public class Application {

    @Autowired
    private Database database;

    @Autowired
    private WebService webService;

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void setWebService(WebService webService) {
        this.webService = webService;
    }

    public String businessMethod(String input) {
        String response = webService.call(input);
        return database.persist(response);
    }
}
