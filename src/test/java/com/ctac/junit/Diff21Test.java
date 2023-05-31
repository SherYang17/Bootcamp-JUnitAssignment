package com.ctac.junit;


import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals; // needs this

public class Diff21Test {

    @Test
    public void testDiff21() {
        Diff21 diff21 = new Diff21();

        assertEquals(2, diff21.diff21(19));
        assertEquals(11, diff21.diff21(10));
        assertEquals(0, diff21.diff21(21));

    }
}

