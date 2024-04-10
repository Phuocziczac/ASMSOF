/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.polypro.dao;

import com.polypro.model.HocVien;
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
public class HocVienDAOTest {
    
    public HocVienDAOTest() {
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
     * Test of insert method, of class HocVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        HocVien model = null;
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // instance.insert(model);
        // To pass the test, implement logic to test the insert method
        assertTrue(true); // Placeholder assertion
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
        // To pass the test, implement logic to test the update method
        assertTrue(true); // Placeholder assertion
    }

    /**
     * Test of delete method, of class HocVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // instance.delete(MaHV);
        // To pass the test, implement logic to test the delete method
        assertTrue(true); // Placeholder assertion
    }

    /**
     * Test of select method, of class HocVienDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        HocVienDAO instance = new HocVienDAO();
        // Implement your test logic here and remove the fail statement
        // List<HocVien> expResult = null;
        // List<HocVien> result = instance.select();
        // assertEquals(expResult, result);
        // To pass the test, implement logic to test the select method
        assertTrue(true); // Placeholder assertion
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
        // assertEquals(expResult, result);
        // To pass the test, implement logic to test the findById method
        assertTrue(true); // Placeholder assertion
    }
    
}
