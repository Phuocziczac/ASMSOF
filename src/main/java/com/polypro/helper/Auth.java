/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polypro.helper;

import com.polypro.model.NhanVien;

/**
 *
 * @author ASUS
 */
public class Auth {
     // Đối tương này chứa thông tin người sử dụng khi đăng nhập//

    public static NhanVien user = null;

    // Xóa thông tin của người sử khi có yêu cầu đăng xuất//
    public static void clear() {
        Auth.user = null;
    }
    // Kiểm tra xem đăng nhập hay chưa 
//    * @return đăng nhập hay chưa  //


    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro();
    }
}
