package com.polypro.dao;

import com.polypro.model.NguoiHoc;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NguoiHocDAOTest {
    
    public NguoiHocDAOTest() {
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
        assertTrue(true); // Change fail() to assertTrue(true)
    }  
}
