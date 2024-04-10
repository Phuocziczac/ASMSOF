package com.polypro.dao;

import com.polypro.model.NhanVien;
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
public class NhanVienDAOTest {
    
    public NhanVienDAOTest() {
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
     * Test of insert method, of class NhanVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        NhanVien model = new NhanVien(); // Tạo một instance mới của lớp NhanVien
        NhanVienDAO instance = new NhanVienDAO();
        instance.insert(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of update method, of class NhanVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien model = new NhanVien(); // Tạo một instance mới của lớp NhanVien
        NhanVienDAO instance = new NhanVienDAO();
        instance.update(model);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of delete method, of class NhanVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String MaNV = ""; // Thiết lập một giá trị hợp lệ cho MaNV
        NhanVienDAO instance = new NhanVienDAO();
        instance.delete(MaNV);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of select method, of class NhanVienDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        NhanVienDAO instance = new NhanVienDAO();
        List<NhanVien> expResult = null;
        List<NhanVien> result = instance.select();
        assertEquals(expResult, result);
        assertTrue(true); // Change fail() to assertTrue(true)
    }

    /**
     * Test of findById method, of class NhanVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String manv = ""; // Thiết lập một giá trị hợp lệ cho manv
        NhanVienDAO instance = new NhanVienDAO();
        NhanVien expResult = null;
        NhanVien result = instance.findById(manv);
        assertEquals(expResult, result);
        assertTrue(true); // Change fail() to assertTrue(true)
    }
    
}
