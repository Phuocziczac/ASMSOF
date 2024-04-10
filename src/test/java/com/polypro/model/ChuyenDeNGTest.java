/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.polypro.model;

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
public class ChuyenDeNGTest {
    
    public ChuyenDeNGTest() {
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
     * Test of toString method, of class ChuyenDe.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ChuyenDe instance = new ChuyenDe();
        // Thiết lập giá trị mong đợi
        String expResult = "ChuyenDe{MaCD=null, TenCD=null, HocPhi=0.0, ThoiLuong=0, Hinh=null, MoTa=null}";
        String result = instance.toString();
        assertEquals(result, expResult);
    }

    /**
     * Test of getMaCD method, of class ChuyenDe.
     */
    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        ChuyenDe instance = new ChuyenDe();
        // Thiết lập giá trị cho MaCD
        String expResult = "CD001";
        instance.setMaCD(expResult);
        String result = instance.getMaCD();
        assertEquals(result, expResult);
    }

    /**
     * Test of setMaCD method, of class ChuyenDe.
     */
    @Test
    public void testSetMaCD() {
        System.out.println("setMaCD");
        String maCD = "CD001";
        ChuyenDe instance = new ChuyenDe();
        instance.setMaCD(maCD);
        // Kiểm tra xem MaCD đã được thiết lập chính xác không
        assertEquals(instance.getMaCD(), maCD);
    }

    /**
     * Test of getTenCD method, of class ChuyenDe.
     */
    @Test
    public void testGetTenCD() {
        System.out.println("getTenCD");
        ChuyenDe instance = new ChuyenDe();
        // Thiết lập giá trị cho TenCD
        String expResult = "Chuyen de Test";
        instance.setTenCD(expResult);
        String result = instance.getTenCD();
        assertEquals(result, expResult);
    }

    /**
     * Test of setTenCD method, of class ChuyenDe.
     */
    @Test
    public void testSetTenCD() {
        System.out.println("setTenCD");
        String tenCD = "Chuyen de Test";
        ChuyenDe instance = new ChuyenDe();
        instance.setTenCD(tenCD);
        // Kiểm tra xem TenCD đã được thiết lập chính xác không
        assertEquals(instance.getTenCD(), tenCD);
    }

    /**
     * Test of getHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        ChuyenDe instance = new ChuyenDe();
        // Thiết lập giá trị cho HocPhi
        double expResult = 1000000.0;
        instance.setHocPhi(expResult);
        double result = instance.getHocPhi();
        assertEquals(result, expResult, 0.0);
    }

    /**
     * Test of setHocPhi method, of class ChuyenDe.
     */
    @Test
    public void testSetHocPhi() {
        System.out.println("setHocPhi");
        double hocPhi = 1000000.0;
        ChuyenDe instance = new ChuyenDe();
        instance.setHocPhi(hocPhi);
        // Kiểm tra xem HocPhi đã được thiết lập chính xác không
        assertEquals(instance.getHocPhi(), hocPhi, 0.0);
    }

    /**
     * Test of getThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        ChuyenDe instance = new ChuyenDe();
        // Thiết lập giá trị cho ThoiLuong
        int expResult = 10;
        instance.setThoiLuong(expResult);
        int result = instance.getThoiLuong();
        assertEquals(result, expResult);
    }

    /**
     * Test of setThoiLuong method, of class ChuyenDe.
     */
    @Test
    public void testSetThoiLuong() {
        System.out.println("setThoiLuong");
        int expResult = 10;
        ChuyenDe instance = new ChuyenDe();
        instance.setThoiLuong(expResult);
        // Kiểm tra xem ThoiLuong đã được thiết lập chính xác không
        assertEquals(instance.getThoiLuong(), expResult);
    }
}
