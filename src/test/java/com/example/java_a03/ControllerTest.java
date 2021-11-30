package com.example.java_a03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ControllerTest {


    @Test
    public void testIfEmailIsNotNull() {
        assertNotNull(userEmail);
    }

    @Test
    public void testIfEmailIsWellFormed(){
        assertTrue(userEmail.endsWith(".com"));
        assertTrue(userEmail.contains("@"));
    }

    @Test
    public void testIfPasswordIsCorrectLength(){
        assertTrue(userPassword.length()>= 7);
    }

    @Test
    public void testIfPasswordHasNumber(){
        assertTrue(// pass in test here);
    }


    @Test
    public void testIfPasswordHasLetter(){
        assertTrue(// pass in test here);
    }

    @Test
    public void testIfPasswordHasSpecialCharacter(){
        assertTrue(// pass in test here);
    }


}
