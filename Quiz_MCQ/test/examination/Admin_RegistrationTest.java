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
public class Admin_RegistrationTest {
    
    public Admin_RegistrationTest() {
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
     * Test of validation method, of class Admin_Registration.
     */
    @Test
    public void testValidation() {
        System.out.println("validation");
        String adminname = "";
        String password = "";
        String cPassword = "";
        Admin_Registration instance = new Admin_Registration();
        boolean expResult = true;
        boolean result = instance.validation(adminname, password, cPassword);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testValidationTwo() {
        System.out.println("validation");
        String adminname = "adminname";
        String password = "password";
        String cPassword = "cPassword";
        Admin_Registration instance = new Admin_Registration();
        boolean expResult = true;
        boolean result = instance.validation(adminname, password, cPassword);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testValidationThree() {
        System.out.println("validation");
        String adminname = "asdfasv2";
        String password = "23kjbkj";
        String cPassword = "234hvsdh";
        Admin_Registration instance = new Admin_Registration();
        boolean expResult = true;
        boolean result = instance.validation(adminname, password, cPassword);
        assertEquals(expResult, result);
    }
}
