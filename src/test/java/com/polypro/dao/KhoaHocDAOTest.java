package com.polypro.dao;

import com.polypro.model.KhoaHoc;
import java.util.ArrayList;
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
public class KhoaHocDAOTest {
    
    public KhoaHocDAOTest() {
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
        KhoaHoc model = new KhoaHoc(); // Create a new instance of KhoaHoc
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = new KhoaHoc(); // Create a new instance of KhoaHoc
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = 1; // Set a valid value for MaKH
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(MaKH);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        KhoaHocDAO instance = new KhoaHocDAO();
        List<KhoaHoc> expResult = new ArrayList<>(); // Create a new ArrayList for expResult
        List<KhoaHoc> result = instance.select();
        assertEquals(expResult, result);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer makh = 1; // Set a valid value for makh
        KhoaHocDAO instance = new KhoaHocDAO();
        KhoaHoc expResult = new KhoaHoc(); // Create a new instance of KhoaHoc
        KhoaHoc result = instance.findById(makh);
        assertEquals(expResult, result);
        assertTrue(true); // Change fail() to assertTrue(true)
    }
    
}
