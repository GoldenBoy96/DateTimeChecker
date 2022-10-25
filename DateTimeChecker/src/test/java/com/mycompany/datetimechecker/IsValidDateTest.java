/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datetimechecker;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Huu Minh
 */
public class IsValidDateTest {

    public void isValidDateTest(boolean result, int day, int month, int year) throws IOException, Exception {
        Form1 f = new Form1();
        assertEquals(result, f.isValidDate(day, month, year));
    }

    public void isValidDateTest(String exception, int day, int month, int year) throws IOException, Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(day, month, year);
        } catch (Exception e) {
            Assertions.assertEquals(exception, e.getMessage());
        }
    }

    @Test
    public void testUTCID01() throws Exception {
        isValidDateTest(true, 29, 2, 2000);
    }

    @Test
    public void testUTCID02() throws Exception {
        isValidDateTest(false, 29, 2, 2009);
    }

    @Test
    public void testUTCID03() throws Exception {
        isValidDateTest(false, 31, 2, 2020);
    }

    @Test
    public void testUTCID04() throws Exception {
        isValidDateTest("OutOfRangeException", 0, 4, 2009);
    }

    @Test
    public void testUTCID05() throws Exception {
        isValidDateTest(true, 1, 3, 2000);
    }

    @Test
    public void testUTCID06() throws Exception {
        isValidDateTest(false, 30, 2, 2100);
    }

    @Test
    public void testUTCID07() throws Exception {
        isValidDateTest("OutOfRangeException", 32, 4, 2020);

    }

    @Test
    public void testUTCID08() throws Exception {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Form1 f = new Form1();
            Integer day = null;
            f.isValidDate(day, 3, 2009);
        });
    }

    @Test
    public void testUTCID09() throws Exception {
        isValidDateTest(false, 31, 4, 2100);
    }

    @Test
    public void testUTCID10() throws Exception {
        isValidDateTest(true, 31, 7, 2009);
    }

    @Test
    public void testUTCID11() throws Exception {
        isValidDateTest("OutOfRangeException", 29, 0, 2009);
    }

    @Test
    public void testUTCID12() throws Exception {
        isValidDateTest("OutOfRangeException", 30, 13, 2111);
    }

    @Test
    public void testUTCID13() throws Exception {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Form1 f = new Form1();
            Integer month = null;
            f.isValidDate(29, month, 2111);
        });
    }

    @Test
    public void testUTCID14() throws Exception {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Form1 f = new Form1();
            Integer year = null;
            f.isValidDate(30, 7, year);
        });
    }

    @Test
    public void testUTCID15() throws Exception {
        isValidDateTest("OutOfRangeException", 1, 4, 1000);
    }

    @Test
    public void testUTCID016() throws Exception {
        isValidDateTest("OutOfRangeException", 1, 1, 10);
    }
}
