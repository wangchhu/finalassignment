/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.SQLException;
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
public class Student_registerTest {
    
    public Student_registerTest() {
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
     * Test of validation method, of class Student_register.
     */
    @Test
    public void testValidation() throws ClassNotFoundException, SQLException {
        System.out.println("validation");
        String username = "";
        String Password = "";
        String cPassword = "";
        String std_name = "";
        Student_register instance = new Student_register();
        boolean expResult = true;
        boolean result = instance.validation(username, Password, cPassword, std_name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidationTwo() throws ClassNotFoundException, SQLException {
        System.out.println("validation");
        String username = "username";
        String Password = "password";
        String cPassword = "cPassword";
        String std_name = "std_name";
        Student_register instance = new Student_register();
        boolean expResult = true;
        boolean result = instance.validation(username, Password, cPassword, std_name);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testValidation3() throws ClassNotFoundException, SQLException {
        System.out.println("validation");
        String username = "123124";
        String Password = "124124";
        String cPassword = "3wfsd13";
        String std_name = "2323df";
        Student_register instance = new Student_register();
        boolean expResult = true;
        boolean result = instance.validation(username, Password, cPassword, std_name);
        assertEquals(expResult, result);
    }
    
}
