/**
 * @author Aliaksei Huryanchyk
 */module EmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.guru13;
    opens com.guru13.view;
    opens com.guru13.controller;
//    opens com.guru13.model;
}