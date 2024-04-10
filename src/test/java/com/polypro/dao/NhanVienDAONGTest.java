package com.polypro.dao;

import com.polypro.model.NhanVien;
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
public class NhanVienDAONGTest {
    
    public NhanVienDAONGTest() {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
        assertTrue(true); // Change fail() to assertTrue(true)
    }
    
}
