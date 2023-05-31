package com.ctac.junit;

import com.ctac.junit.MyNameIs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MyNameIsTest {

    @Test
    public void testMyNameOutput() {
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Act
        MyNameIs.main(new String[]{});

        // Assert
        String expectedOutput = "My name is" + System.lineSeparator() + "Yangy" + System.lineSeparator() + "Yang";
        String actualOutput = outputStream.toString().trim();
        Assertions.assertEquals(expectedOutput.trim(), actualOutput);
    }
}
