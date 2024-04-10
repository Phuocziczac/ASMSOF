package com.polypro.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NGUYEN DUC THIEN
 */
public class ChuyenDeTest {
    
    public ChuyenDeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetMaCD() {
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testSetMaCD() {
        String maCD = "M01";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(maCD);
        String expected = "M01";
        assertEquals(expected, instance.getMaCD());
    }

    /**
     * Test of getTenCD method, of class ChuyenDe.
     */
    @Test
    public void testGetTenCD() {
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getTenCD();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTenCD method, of class ChuyenDe.
     */
    @Test
    public void testSetTenCD() {
        String tenCD = "Chuyen de Test";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(tenCD);
        assertEquals(tenCD, instance.getTenCD());
    }

    /**
     * Test of getHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testGetHocPhi() {
        ChuyenDe instance = new ChuyenDe();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testSetHocPhi() {
        double hocPhi = 600;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
        assertEquals(hocPhi, instance.getHocPhi());
    }
    
    @Test
    public void testSetHocPhiWithNegative() {
        double hocPhi = -600;
        ChuyenDe instance = new ChuyenDe();
        assertThrows(IllegalArgumentException.class, () -> instance.setHocPhi(hocPhi));
    }
    
    @Test
    public void testSetHocPhiWithLarge() {
        double hocPhi = 600000000d;
        ChuyenDe instance = new ChuyenDe();
        assertThrows(IllegalArgumentException.class, () -> instance.setHocPhi(hocPhi));
    }

  
    @Test
    public void testGetThoiLuong() {
        ChuyenDe instance = new ChuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetThoiLuong() {
        int thoiLuong = 10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(thoiLuong);
        assertEquals(thoiLuong, instance.getThoiLuong());
    }
    
    @Test
    public void testSetThoiLuongWithNegative() {
        int thoiLuong = -10;
        ChuyenDe instance = new ChuyenDe();
        assertThrows(IllegalArgumentException.class, () -> instance.setThoiLuong(thoiLuong));
    }
    
    @Test
    public void testGetHinh() {
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getHinh();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHinh method, of class ChuyenDe.
     */
    @Test
    public void testSetHinh() {
        String hinh = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setHinh(hinh);
        assertEquals(hinh, instance.getHinh());
    }

    /**
     * Test of getMoTa method, of class ChuyenDe.
     */
    @Test
    public void testGetMoTa() {
        ChuyenDe instance = new ChuyenDe();
        String expResult = "";
        String result = instance.getMoTa();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMoTa method, of class ChuyenDe.
     */
    @Test
    public void testSetMoTa() {
        String moTa = "";
        ChuyenDe instance = new ChuyenDe();
        instance.setMoTa(moTa);
        assertEquals(moTa, instance.getMoTa());
    }
}
