/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.MyAgileTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cjptech
 */
public class MyAgileTesttest {
    
    public MyAgileTesttest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testAdd(){
	        System.out.println("add");
	String s1 = "3";
	String s2 = "2" ;
	MyAgileTest instance = new MyAgileTest();
	String expResult = "32";
	String result = instance.add(s1,s2);
	assertEquals(expResult, result);

} 
}
