/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
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
public class DayInMonthTest {

    

//    @Test
//public void whenExceptionThrown_thenAssertionSucceeds() {
//    Exception exception = assertThrows(NumberFormatException.class, () -> {
//        Integer.parseInt("1a");
//    });
//
//    String expectedMessage = "For input string";
//    String actualMessage = exception.getMessage();
//
//    assertTrue(actualMessage.contains(expectedMessage));
//}
//    
    public void dayInMonthTest(int result, int month, int year) throws IOException, Exception {
        Form1 f = new Form1();

        assertEquals(result, f.daysInMonth(month, year));

    }

    public void dayInMonthTest(String exception, int month, int year) throws IOException, Exception {
        Form1 f = new Form1();
        try {
            f.daysInMonth(month, year);
        } catch (Exception e) {
            Assertions.assertEquals(exception, e.getMessage());
        }
    }

//    public void dayInMonthTest(int result, String month, int year) {
//        Form1 f = new Form1();
//        assertTrue(f.daysInMonth(month, year));
//    }
    @Test
    public void testUTCID01() throws Exception {
        dayInMonthTest(31, 1, 2020);
    }

    @Test
    public void testUTCID02() throws Exception {
        dayInMonthTest(28, 2, 2021);
    }

    @Test
    public void testUTCID03() throws Exception {
        dayInMonthTest(28, 2, 2019);
    }

    @Test
    public void testUTCID04() throws Exception {
        dayInMonthTest(30, 9, 2021);
    }

    @Test
    public void testUTCID05() throws Exception {
        dayInMonthTest(28, 2, 2100);
    }

    @Test
    public void testUTCID06() throws Exception {
        dayInMonthTest(29, 2, 2020);
    }

    @Test
    public void testUTCID07() throws Exception {

        Assertions.assertThrows(NullPointerException.class, () -> {
            Form1 f = new Form1();
            Integer month = null;
            f.daysInMonth(month, 2019);
        });
        //Bởi vì hàm bình thường gặp exception sẽ không return được nên cần 
        //bắt exception thay vì kiểm tra đầu ra
//        Form1 f = new Form1();
//        Integer month = null;
//        dayInMonthTest("NullPointerException", month, 2019);
    }

    //xem lại chỗ này, chuyển thành throw exception
    @Test()
    public void testUTCID08() throws Exception {

        dayInMonthTest("OutOfRangeException", -1, 2019);
    }

    @Test
    public void testUTCID09() throws Exception {
        dayInMonthTest("OutOfRangeException", 13, 2021);
    }
    //==============================================

    @Test
    public void testUTCID10() throws Exception {
        dayInMonthTest(31, 12, 2019);
    }

    //xem lại
    @Test
    public void testUTCID11() throws Exception {
        dayInMonthTest(30, 9, 1000);
    }

    @Test
    public void testUTCID12() throws Exception {
        dayInMonthTest(31, 1, 3000);
    }

    //===============================================
    //làm lại null
//    public void testUTCID13() {
//        dayInMonthTest(exception, 12, "");
//    }
    @Test
    public void testUTCID14() throws Exception {
        dayInMonthTest("OutOfRangeException", 9, 10);
    }

    @Test
    public void testUTCID15() throws Exception {
        dayInMonthTest("OutOfRangeException", 1, 3500);
    }

}
