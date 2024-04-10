/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.polypro.dao;

import com.polypro.model.ChuyenDe;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NGUYEN DUC THIEN
 */
public class ChuyenDeDAOTest {
    
    public ChuyenDeDAOTest() {
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

    @Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.insert(model);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the insert method
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.update(model);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the update method
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaCD = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.delete(MaCD);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the delete method
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // List<ChuyenDe> expResult = null;
        // List<ChuyenDe> result = instance.select();
        // assertEquals(expResult, result);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the select method
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        String macd = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // ChuyenDe expResult = null;
        // ChuyenDe result = instance.findById(macd);
        // assertEquals(expResult, result);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the findById method
    }
    
}
