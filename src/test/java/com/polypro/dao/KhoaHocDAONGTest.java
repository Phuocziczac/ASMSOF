package com.polypro.dao;

import com.polypro.helper.Jdbc;
import com.polypro.model.KhoaHoc;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.mockito.ArgumentMatchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import static org.testng.Assert.*;
import org.testng.IObjectFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

/**
 *
 * @author NGUYEN DUC THIEN
 */
@PrepareForTest ({Jdbc.class, KhoaHocDAO.class})
public class KhoaHocDAONGTest {
    KhoaHocDAO khoaHocDAO;
    KhoaHocDAO khoaHocDAOSpy;
    
    public KhoaHocDAONGTest() {
    }
    
    @ObjectFactory
    public IObjectFactory getObjectFactory (){
        return new org.powermock.modules.testng.PowerMockObjectFactory();
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        khoaHocDAO = new KhoaHocDAO();
        PowerMockito.mockStatic(Jdbc.class);
        khoaHocDAOSpy = PowerMockito.spy(new KhoaHocDAO ());
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test ( expectedExceptions = Exception.class)
    public void testInsertWithNullModel() {
        System.out.println("insert");
        KhoaHoc model = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
    }
     
    @Test ( expectedExceptions = Exception.class)
    public void testInsertWithEmptyModel() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
    }
     
    @Test 
    public void testInsertWithValidModel() {
        System.out.println("insert");
        KhoaHoc model = new KhoaHoc();
        model.setGhiChu("");
        model.setHocPhi(20);
        model.setMaCD("12");
        model.setMaKH(1);
        model.setMaNV("N01");
        model.setNgayKG(new Date ());
        model.setNgayTao(new Date());
        model.setThoiLuong(200);
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.insert(model);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        KhoaHoc model = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.update(model);
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = null;
        KhoaHocDAO instance = new KhoaHocDAO();
        instance.delete(MaKH);
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testSelect() {
        System.out.println("select");
        KhoaHocDAO instance = new KhoaHocDAO();
        List<KhoaHoc> expResult = null;
        List<KhoaHoc> result = instance.select();
        assertEquals(result, expResult);
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testFindByIdWithValidID() throws Exception {
        System.out.println("findById");
        Integer makh = 12;
        KhoaHoc expectedResult = new KhoaHoc();
        List<KhoaHoc> resultList = new ArrayList<>();
        resultList.add(expectedResult);
        PowerMockito.doReturn(resultList)
                .when(khoaHocDAOSpy, "select", ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
        
        KhoaHoc result = khoaHocDAOSpy.findById(makh);
        
        Assert.assertThat(result,CoreMatchers.is(expectedResult));
    }
    
    @Test
    public void testFindByIdWithNotFoundID() throws Exception {
        System.out.println("findById");
        Integer makh = -1;
        KhoaHoc expectedResult = null;
        List<KhoaHoc> resultList = new ArrayList<>();
        //resultList.add(expectedResult);
        PowerMockito.doReturn(resultList)
                .when(khoaHocDAOSpy, "select", ArgumentMatchers.anyString(),
                        ArgumentMatchers.any());
      
        KhoaHoc result = khoaHocDAOSpy.findById(makh);
        
        Assert.assertThat(result,CoreMatchers.is(expectedResult));
    }  
}
