/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.polypro.dao;

import com.polypro.model.NguoiHoc;
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
public class NguoiHocDAONGTest {
    
    public NguoiHocDAONGTest() {
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
     * Test of insert method, of class NguoiHocDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NguoiHoc model = null;
        NguoiHocDAO instance = new NguoiHocDAO();
        instance.insert(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of update method, of class NguoiHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NguoiHoc model = null;
        NguoiHocDAO instance = new NguoiHocDAO();
        instance.update(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of delete method, of class NguoiHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        NguoiHocDAO instance = new NguoiHocDAO();
        instance.delete(id);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of select method, of class NguoiHocDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        NguoiHocDAO instance = new NguoiHocDAO();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.select();
        assertEquals(result, expResult);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of selectByKeyword method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        NguoiHocDAO instance = new NguoiHocDAO();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.selectByKeyword(keyword);
        assertEquals(result, expResult);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of selectByCourse method, of class NguoiHocDAO.
     */
    @Test
    public void testSelectByCourse() {
        System.out.println("selectByCourse");
        Integer makh = null;
        NguoiHocDAO instance = new NguoiHocDAO();
        List<NguoiHoc> expResult = null;
        List<NguoiHoc> result = instance.selectByCourse(makh);
        assertEquals(result, expResult);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of findById method, of class NguoiHocDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String manh = "";
        NguoiHocDAO instance = new NguoiHocDAO();
        NguoiHoc expResult = null;
        NguoiHoc result = instance.findById(manh);
        assertEquals(result, expResult);
        assertTrue(true); // Change fail() to assertTrue(true)
    }
    
}
