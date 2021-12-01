package com.example.java_a03;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.regex.*;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label userEmail;

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private Label userPassword;

    public boolean isEmailNull(String email){
        return email.isEmpty();
    }

    public boolean isEmailWellFormed(String email){
        return email.endsWith(".com") && email.contains("@");
    }

    public boolean isPasswordLengthCorrect(String password){
        return password.length() >= 7;
    }

    public boolean isNumberInPassword(String password){
        Pattern p1 = Pattern.compile("[1234567890]");
        Matcher m1 = p1.matcher(password);
        return m1.find();
    }

    public boolean isLetterInPassword(String password){
        Pattern p2 = Pattern.compile("[abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        Matcher m2 = p2.matcher(password);
        return m2.find();
    }

    public boolean isSpecialCharacterInPassword(String password){
        Pattern p3 = Pattern.compile("[&^*!@]");
        Matcher m3 = p3.matcher(password);
        return m3.find();
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}