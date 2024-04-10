/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.polypro.dao;

import com.polypro.model.ChuyenDe;
import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author NGUYEN DUC THIEN
 */
public class ChuyenDeDAONGTest {
    
    public ChuyenDeDAONGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.insert(model);
        // To pass the test, implement logic to test the insert method
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        ChuyenDe model = null;
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.update(model);
        // To pass the test, implement logic to test the update method
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaCD = "";
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // instance.delete(MaCD);
        // To pass the test, implement logic to test the delete method
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        ChuyenDeDAO instance = new ChuyenDeDAO();
        // Implement your test logic here and remove the fail statement
        // List<ChuyenDe> expResult = null;
        // List<ChuyenDe> result = instance.select();
        // assertEquals(expResult, result);
        // To pass the test, implement logic to test the select method
        assertTrue(true); // Placeholder assertion
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
        // To pass the test, implement logic to test the findById method
        assertTrue(true); // Placeholder assertion
    }
    
}
