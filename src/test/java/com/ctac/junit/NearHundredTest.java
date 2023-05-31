package com.ctac.junit;
import static org.junit.jupiter.api.Assertions.assertEquals; // needs this
import org.junit.jupiter.api.Test;

public class NearHundredTest {

    @Test
    public void testHelloName() {
        NearHundred nearHundred = new NearHundred();

        assertEquals("Hello Alice!", nearHundred.helloName("Alice"));
        assertEquals("Hello Bob!", nearHundred.helloName("Bob"));
        assertEquals("Hello John!", nearHundred.helloName("John"));
        assertEquals("Hello Jane!", nearHundred.helloName("Jane"));
    }
}