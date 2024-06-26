/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
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
public class NhanVienTest {
    
    public NhanVienTest() {
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
     * Test of toString method, of class NhanVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaNV method, of class NhanVien.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaNV method, of class NhanVien.
     */
    @Test
    public void testSetMaNV() {
        System.out.println("setMaNV");
        String maNV = "NV001";
        NhanVien instance = new NhanVien();
        instance.setMaNV(maNV);
        assertEquals(maNV, instance.getMaNV());
    }

    /**
     * Test of getMatKhau method, of class NhanVien.
     */
    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatKhau method, of class NhanVien.
     */
    @Test
    public void testSetMatKhau() {
        System.out.println("setMatKhau");
        String matKhau = "password";
        NhanVien instance = new NhanVien();
        instance.setMatKhau(matKhau);
        assertEquals(matKhau, instance.getMatKhau());
    }

    /**
     * Test of getHoTen method, of class NhanVien.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        NhanVien instance = new NhanVien();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoTen method, of class NhanVien.
     */
    @Test
    public void testSetHoTen() {
        System.out.println("setHoTen");
        String hoTen = "Nguyen Van A";
        NhanVien instance = new NhanVien();
        instance.setHoTen(hoTen);
        assertEquals(hoTen, instance.getHoTen());
    }

    /**
     * Test of getVaiTro method, of class NhanVien.
     */
    @Test
    public void testGetVaiTro() {
        System.out.println("getVaiTro");
        NhanVien instance = new NhanVien();
        boolean expResult = false;
        boolean result = instance.getVaiTro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVaiTro method, of class NhanVien.
     */
    @Test
    public void testSetVaiTro() {
        System.out.println("setVaiTro");
        boolean vaiTro = true;
        NhanVien instance = new NhanVien();
        instance.setVaiTro(vaiTro);
        assertEquals(vaiTro, instance.getVaiTro());
    }
    
}
