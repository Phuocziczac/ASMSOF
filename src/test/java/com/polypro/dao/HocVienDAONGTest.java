/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.polypro.dao;

import com.polypro.model.HocVien;
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
public class HocVienDAONGTest {
    
    public HocVienDAONGTest() {
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

    /**
     * Test of insert method, of class HocVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        HocVien model = null;
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // instance.insert(model);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the insert method
    }

    /**
     * Test of update method, of class HocVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        HocVien model = null;
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // instance.update(model);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the update method
    }

    /**
     * Test of delete method, of class HocVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        HocVienDAO instance = new HocVienDAO();
        instance.delete(MaHV);
        // Implement your test logic here and remove the fail statement
        // instance.delete(MaHV);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the delete method
    }

    /**
     * Test of select method, of class HocVienDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // List expResult = null;
        // List result = instance.select();
        // assertEquals(result, expResult);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the select method
    }

    /**
     * Test of findById method, of class HocVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer mahv = null;
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // HocVien expResult = null;
        // HocVien result = instance.findById(mahv);
        // assertEquals(result, expResult);
        // fail("The test case is a prototype.");
        // To pass the test, implement logic to test the findById method
    }
    
}
