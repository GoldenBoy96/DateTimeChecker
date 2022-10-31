/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datetimechecker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Huu Minh
 */
public class IsValidDateTest {

    @Test 
    public void testUTCID01() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(29, 2, 2000));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID02() throws Exception {
        Form1 f = new Form1();
        try {
            assertFalse(f.isValidDate(29, 2, 2009));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID03() throws Exception {
        Form1 f = new Form1();
        try {
            assertFalse(f.isValidDate(31, 2, 2020));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID04() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(0, 4, 2009);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID05() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(1, 3, 2020));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID06() throws Exception {
        Form1 f = new Form1();
        try {
            assertFalse(f.isValidDate(30, 2, 2100));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID07() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(32, 4, 2020);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID08() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(31, 4, 2100));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID09() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(31, 7, 2009));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID10() {
        Form1 f = new Form1();
        try {
            f.isValidDate(29, 0, 2009);
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID11() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(30, 13, 2111);
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID12() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(1, 4, 2000));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID13() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(1, 1, 2100));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID14() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(15, 0, 2009));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID15() {
        Form1 f = new Form1();
        try {
            f.isValidDate(0, 2, 2022);
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID016() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(14, 8, 2022));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testUTCID017() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(28, 10, 2111));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testUTCID18() throws Exception {
        Form1 f = new Form1();
        try {
            assertFalse(f.isValidDate(31, 11, 2022));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID19() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(31, 12, 2022));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID20() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(31, 10, 2022));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID21() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(30, 10, 2002));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID22() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(31, 4, 2022));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID23() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(-1, 1, 10));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID24() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(1, -1, 10));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID25() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(-1, -1, 2100));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID26() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(15, 3, 2009));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID27() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(29, 2, 2100));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID28() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(31, 1, 2111));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID29() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(false, form1.isValidDate(0, 13, 3000));
            fail("Exception not thrown");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }
    
    @Test
    public void testUTCID30() throws Exception {
        Form1 form1 = new Form1();
        try {
            assertEquals(true, form1.isValidDate(28, 2, 1000));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUTCID31() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(-1, 8, 2009);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID32() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(1, 8, 2020));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID33() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(31, 7, 2000));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID34() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(28, 11, 2002));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID35() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(31, 9, 2009);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID36() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(29, 9, 2009));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID37() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(32, 7, 2002);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID38() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(15, 10, 2100));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }

    @Test
    public void testUTCID39() throws Exception {
        Form1 f = new Form1();
        try {
            f.isValidDate(0, 11, 2020);
            fail("Not throw exception.");
        } catch (Exception e) {
            assertEquals(e.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID40() throws Exception {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(1, 10, 2100));
        } catch (Exception e) {
            fail("Throw exception.");
        }
    }
    
    @Test
    public void testUTCID41() {
        Form1 f = new Form1();
        try {
            f.isValidDate(-1, 1, 1000);
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID42() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(1, 2, 2000));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID43() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(1, 3, 2002));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID44() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(14, 0, 2009));
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }

    @Test
    public void testUTCID45() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(14, 4, 2009));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID46() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(2, 2, 2020));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID47() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(14, 3, 2000));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID48() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(30, 4, 1000));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID49() {
        Form1 f = new Form1();
        try {
            assertFalse(f.isValidDate(31, 4, 2009));
        } catch (Exception ex) {
            fail("Unexpected exception was thrown");
        }
    }

    @Test
    public void testUTCID50() {
        Form1 f = new Form1();
        try {
            assertTrue(f.isValidDate(32, 4, 2100));
            fail("Expected exception was not thrown");
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "OutOfRangeException");
        }
    }
}
