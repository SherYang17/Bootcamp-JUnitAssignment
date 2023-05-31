package com.ctac.junit;
import static org.junit.jupiter.api.Assertions.assertEquals; // needs this
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba() {
        MakeAbba makeAbba = new MakeAbba();

        String result1 = makeAbba.makeAbba("Hi", "Bye");
        assertEquals("HiByeByeHi", result1);

        String result2 = makeAbba.makeAbba("Yo", "Alice");
        assertEquals("YoAliceAliceYo", result2);

        String result3 = makeAbba.makeAbba("What", "Up");
        assertEquals("WhatUpUpWhat", result3);
    }
}
