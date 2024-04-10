package com.polypro.model;

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
public class HocVienTest {
    
    public HocVienTest() {
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
     * Test of toString method, of class HocVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HocVien instance = new HocVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaHV method, of class HocVien.
     */
    @Test
    public void testGetMaHV() {
        System.out.println("getMaHV");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaHV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaHV method, of class HocVien.
     */
    @Test
    public void testSetMaHV() {
        System.out.println("setMaHV");
        int maHV = 1;
        HocVien instance = new HocVien();
        instance.setMaHV(maHV);
        assertEquals(instance.getMaHV(), maHV);
    }

    /**
     * Test of getMaKH method, of class HocVien.
     */
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        HocVien instance = new HocVien();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaKH method, of class HocVien.
     */
    @Test
    public void testSetMaKH() {
        System.out.println("setMaKH");
        int maKH = 1;
        HocVien instance = new HocVien();
        instance.setMaKH(maKH);
        assertEquals(instance.getMaKH(), maKH);
    }

    /**
     * Test of getMaNH method, of class HocVien.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        HocVien instance = new HocVien();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNH method, of class HocVien.
     */
    @Test
    public void testSetMaNH() {
        System.out.println("setMaNH");
        String maNH = "NH01";
        HocVien instance = new HocVien();
        instance.setMaNH(maNH);
        assertEquals(instance.getMaNH(), maNH);
    }

    /**
     * Test of getDiem method, of class HocVien.
     */
    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        HocVien instance = new HocVien();
        double expResult = 0.0;
        double result = instance.getDiem();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setDiem method, of class HocVien.
     */
    @Test
    public void testSetDiem() {
        System.out.println("setDiem");
        double diem = 7.5;
        HocVien instance = new HocVien();
        instance.setDiem(diem);
        assertEquals(instance.getDiem(), diem, 0);
    }
    
}
