/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Admin_logTest {
    
    public Admin_logTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validation method, of class Admin_log.
     */
    @Test
    public void testValidation() {
        System.out.println("validation");
        String uname = "";
        String password = "";
        Admin_log instance = new Admin_log();
        boolean expResult = false;
        boolean result = instance.validation(uname, password);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testValidationTwo() {
        System.out.println("validation");
        String uname = "admin";
        String password = "admin";
        Admin_log instance = new Admin_log();
        boolean expResult = false;
        boolean result = instance.validation(uname, password);
        assertEquals(expResult, result);
    }

   
}
