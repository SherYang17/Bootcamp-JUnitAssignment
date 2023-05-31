package com.ctac.junit;
import static org.junit.jupiter.api.Assertions.assertEquals; // needs this
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Makes10Test {

    @Test
    public void testMakes10() {
        Makes10 makes10 = new Makes10();

        assertTrue(makes10.makes10(9, 10));
        assertTrue(makes10.makes10(10, 9));

    }
}
