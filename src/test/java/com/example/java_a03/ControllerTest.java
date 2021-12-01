package com.example.java_a03;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControllerTest {
    String userEmail = "Dave@Dave.com";
    String userEmail2 = "";
    String userEmail3 = "Dave@Dave";
    String userEmail4 = "DaveDave.com";
    String userEmail5 = "Dave@Dave.co.uk";

    String userPassword = "Cool*s123456";
    String userPassword2 = "Cools*";
    String userPassword3 = "*123456";
    String userPassword4 = "Cools123456";
    String userPassword5 = "Cool*1";

    @Test
    public void testIfEmailIsNotNull() {
        assertFalse(isEmailNull(userEmail));
        assertFalse(isEmailNull(userEmail2));
        assertFalse(isEmailNull(userEmail3));
        assertFalse(isEmailNull(userEmail4));
        assertFalse(isEmailNull(userEmail5));
    }

    @Test
    public void testIfEmailIsWellFormed(){
        assertTrue(isEmailWellFormed(userEmail));
        assertTrue(isEmailWellFormed(userEmail2));
        assertTrue(isEmailWellFormed(userEmail3));
        assertTrue(isEmailWellFormed(userEmail4));
        assertTrue(isEmailWellFormed(userEmail5));
    }

    @Test
    public void testIfPasswordIsCorrectLength(){
        assertTrue(isLengthCorrect(userPassword));
        assertTrue(isLengthCorrect(userPassword2));
        assertTrue(isLengthCorrect(userPassword3));
        assertTrue(isLengthCorrect(userPassword4));
        assertTrue(isLengthCorrect(userPassword5));
    }

    @Test
    public void testIfPasswordHasNumber(){
        assertTrue(isNumberInPassword(userPassword));
        assertTrue(isNumberInPassword(userPassword2));
        assertTrue(isNumberInPassword(userPassword3));
        assertTrue(isNumberInPassword(userPassword4));
        assertTrue(isNumberInPassword(userPassword5));

    }


    @Test
    public void testIfPasswordHasLetter(){
        assertTrue(isLetterInPassword(userPassword));
        assertTrue(isLetterInPassword(userPassword2));
        assertTrue(isLetterInPassword(userPassword3));
        assertTrue(isLetterInPassword(userPassword4));
        assertTrue(isLetterInPassword(userPassword5));
    }

    @Test
    public void testIfPasswordHasSpecialCharacter(){
        assertTrue(isSpecialCharacterInPassword(userPassword));
        assertTrue(isSpecialCharacterInPassword(userPassword2));
        assertTrue(isSpecialCharacterInPassword(userPassword3));
        assertTrue(isSpecialCharacterInPassword(userPassword4));
        assertTrue(isSpecialCharacterInPassword(userPassword5));

    }


}
