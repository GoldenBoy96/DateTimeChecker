/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package com.mycompany.datetimechecker;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Huu Minh
 */
public class DayInMonthTest {

    @Test
    public void triUTCID01() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 31;
            int result = f.daysInMonth(1, 2020);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void triUTCID02() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 28;
            int result = f.daysInMonth(2, 2021);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void triUTCID03() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 28;
            int result = f.daysInMonth(2, 2019);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void triUTCID04() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 30;
            int result = f.daysInMonth(9, 2021);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void triUTCID05() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 28;
            int result = f.daysInMonth(2, 2100);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void triUTCID06() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 29;
            int result = f.daysInMonth(2, 2020);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void triUTCID07() throws Exception {
        Form1 f = new Form1();
        try {
            f.daysInMonth(-1, 2019);
            fail("Not throw excepion.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test()
    public void ducUTCID08() throws Exception {

        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(13, 2021));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void ducUTCID09() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(30, form1.daysInMonth(12, 2019));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void ducUTCID10() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(30, form1.daysInMonth(10, 2500));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void ducUTCID11() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(0, 2500));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void ducUTCID12() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(9, 2449));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void ducUTCID13() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(1, 2499));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void ducUTCID14() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(30, form1.daysInMonth(10, 2449));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void minhUTCID15() throws Exception {
        Form1 f = new Form1();
        assertEquals(31, f.daysInMonth(3, 2350));
    }

    @Test
    public void minhUTCID16() {
        Form1 f = new Form1();
        String expectedEx = "OutOfRangeException";
        try {
            int a = f.daysInMonth(-1, 2012);
            fail("Not throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(expectedEx, e.getMessage());
        }
    }

    @Test
    public void minhUTCID17() throws Exception {
        Form1 f = new Form1();
        String expectedEx = "OutOfRangeException";
        try {
            int a = f.daysInMonth(0, 1000);
            fail("Not throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(expectedEx, e.getMessage());
        }
    }

    @Test
    public void minhUTCID18() throws Exception {
        Form1 f = new Form1();
        String expectedEx = "OutOfRangeException";
        try {
            int a = f.daysInMonth(1, 950);
            fail("Not throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(expectedEx, e.getMessage());
        }
    }

    @Test
    public void minhUTCID19() throws Exception {
        Form1 f = new Form1();
        String expectedEx = "OutOfRangeException";
        try {
            int a = f.daysInMonth(7, -1);
            fail("Not throw exception");
        } catch (Exception e) {
            Assertions.assertEquals(expectedEx, e.getMessage());
        }

    }
    
    @Test
    public void kUTCID20() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 30;
            int result = f.daysInMonth(4, 2010);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void kUTCID21() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 30;
            int result = f.daysInMonth(6, 2012);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void kUTCID22() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 31;
            int result = f.daysInMonth(5, 2012);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void kUTCID23() throws Exception {
        Form1 f = new Form1();
        try {
            int expect = 30;
            int result = f.daysInMonth(6, 2010);
            assertEquals(expect, result);
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void kUTCID24() throws Exception {
        Form1 f = new Form1();
        try {
            f.daysInMonth(5, 3500);
            fail("Not throw excepion.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID25() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(3, 2350));
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testUTCID26() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(2, 3500));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
        
    }

    @Test
    public void testUTCID27() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(7, 999));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID28() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(31, form1.daysInMonth(12, 2500));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID29() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(30, form1.daysInMonth(9, 2020));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    

}
