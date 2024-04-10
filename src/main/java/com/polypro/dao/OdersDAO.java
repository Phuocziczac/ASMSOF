///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package DAO;
//
//import Enity.Order;
//import JDBC.JdbcHelper;
//
///**
// *
// * @author ASUS
// */
//public class OdersDAO {
//    public void insert(Order entity){
// String sql="INSERT INTO Orders (OrderID, UserID, OrderDate, TotalAMount) VALUES (?, ?, ?, ?)";
//        JdbcHelper.executeUpdate(sql,
// entity.getOrderID(),
// entity.getUserID(),
// entity.getOrderDate(),
// entity.getTotalAmount());
// }
//    
//    public void update(Order entity){
// String sql="UPDATE ChuyenDe SET TenCD=?, HocPhi=?, ThoiLuong=?, Hinh=?, MoTa=? WHERE MaCD=?";
// JdbcHelper.executeUpdate(sql,
// entity.getOrderID(),
// entity.getUserID(),
// entity.getOrderDate(),
// entity.getTotalAmount());
//
// }
//    
//    
//    
//    
//}
//
