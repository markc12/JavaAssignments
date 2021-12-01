package com.example.java_a03;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControllerTest {
    private HelloController controller;
    String userEmail = "Dave@Dave.com";
    String userEmail2 = "";
    String userEmail3 = "Dave@Dave";
    String userEmail4 = "DaveDave.com";
    String userEmail5 = "Dave@Dave.co.uk";

    String userPassword = "Cool*s123456";
    String userPassword2 = "Coolss*";
    String userPassword3 = "*123456";
    String userPassword4 = "Cools123456";
    String userPassword5 = "Cool*1";

    @BeforeEach
    void init(){
        controller = new HelloController();
    }

    @Test
    public void testIfEmailIsNotNull() {
        assertFalse(controller.isEmailNull(userEmail));
        assertTrue(controller.isEmailNull(userEmail2));
        assertFalse(controller.isEmailNull(userEmail3));
        assertFalse(controller.isEmailNull(userEmail4));
        assertFalse(controller.isEmailNull(userEmail5));
    }

    @Test
    //for the purpose of this assignment a well-formed email is one that contains the at symbol and ends in .com
    public void testIfEmailIsWellFormed(){
        assertTrue(controller.isEmailWellFormed(userEmail));
        assertFalse(controller.isEmailWellFormed(userEmail2));
        assertFalse(controller.isEmailWellFormed(userEmail3));
        assertFalse(controller.isEmailWellFormed(userEmail4));
        assertFalse(controller.isEmailWellFormed(userEmail5));
    }

    @Test
    public void testIfPasswordIsCorrectLength(){
        assertTrue(controller.isPasswordLengthCorrect(userPassword));
        assertTrue(controller.isPasswordLengthCorrect(userPassword2));
        assertTrue(controller.isPasswordLengthCorrect(userPassword3));
        assertTrue(controller.isPasswordLengthCorrect(userPassword4));
        assertTrue(controller.isPasswordLengthCorrect(userPassword5));
    }

    @Test
    public void testIfPasswordHasNumber(){
        assertTrue(controller.isNumberInPassword(userPassword));
        assertTrue(controller.isNumberInPassword(userPassword2));
        assertTrue(controller.isNumberInPassword(userPassword3));
        assertTrue(controller.isNumberInPassword(userPassword4));
        assertTrue(controller.isNumberInPassword(userPassword5));

    }


    @Test
    public void testIfPasswordHasLetter(){
        assertTrue(controller.isLetterInPassword(userPassword));
        assertTrue(controller.isLetterInPassword(userPassword2));
        assertTrue(controller.isLetterInPassword(userPassword3));
        assertTrue(controller.isLetterInPassword(userPassword4));
        assertTrue(controller.isLetterInPassword(userPassword5));
    }

    @Test
    public void testIfPasswordHasSpecialCharacter(){
        assertTrue(controller.isSpecialCharacterInPassword(userPassword));
        assertTrue(controller.isSpecialCharacterInPassword(userPassword2));
        assertTrue(controller.isSpecialCharacterInPassword(userPassword3));
        assertTrue(controller.isSpecialCharacterInPassword(userPassword4));
        assertTrue(controller.isSpecialCharacterInPassword(userPassword5));

    }


}
