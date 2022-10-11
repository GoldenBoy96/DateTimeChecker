/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package com.mycompany.datetimechecker;

import junit.framework.TestCase;
import com.mycompany.datetimechecker.DateTimeChecker;

/**
 *
 * @author Huu Minh
 */
public class JUnitTest extends TestCase {

    public JUnitTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    public void testMonth() {
        Form1 f = new Form1();
        Integer thirtyOneDays[] = {1, 3, 5, 7, 8, 10, 12};
        Integer thirtyDays[] = {4, 6, 9, 11};
        for (Integer x : thirtyDays) {
            testmonth(30, x, 2022);
        }
        for (Integer x : thirtyOneDays) {
            assertEquals(31, f.daysInMonth(x, 2022));
        }
        assertEquals(29, f.daysInMonth(2, 2020));
        assertEquals(28, f.daysInMonth(2, 2022));
        //assertEquals(35, f.daysInMonth(13, 4023));
    }
    
    public void testmonth(int day, int month, int year) {
        Form1 f = new Form1();
        assertEquals(day, f.daysInMonth(month, year));
    }

}
