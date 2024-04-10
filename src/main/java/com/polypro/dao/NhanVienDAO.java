/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polypro.dao;

import com.polypro.helper.Jdbc;
import com.polypro.model.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class NhanVienDAO {
     public void insert(NhanVien model){
 String sql="INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?, ?, ?, ?)";
 Jdbc.executeUpdate(sql,
 model.getMaNV(),
 model.getMatKhau(),
 model.getHoTen(),
 model.getVaiTro());
 }

 public void update(NhanVien model){
 String sql="UPDATE NhanVien SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNV=?";
 Jdbc.executeUpdate(sql,
 model.getMatKhau(),
 model.getHoTen(),
 model.getVaiTro(),
 model.getMaNV());
 }

 public void delete(String MaNV){
 String sql="DELETE FROM NhanVien WHERE MaNV=?";
 Jdbc.executeUpdate(sql, MaNV);
 }

 public List<NhanVien> select(){
 String sql="SELECT * FROM NhanVien";
 return select(sql);
 }

 public NhanVien findById(String manv){
 String sql="SELECT * FROM NhanVien WHERE MaNV=?";
 List<NhanVien> list = select(sql, manv);
 return list.size() > 0 ? list.get(0) : null;
 }

 private List<NhanVien> select(String sql, Object...args){
 List<NhanVien> list=new ArrayList<>();
 try {
 ResultSet rs = null;
 try {
 rs = Jdbc.executeQuery(sql, args);
 while(rs.next()){
 NhanVien model=readFromResultSet(rs);
 list.add(model);
 }
 }
 finally{
 rs.getStatement().getConnection().close();
 }
 }
 catch (SQLException ex) {
 throw new RuntimeException(ex);
 }
 return list;
 }

 private NhanVien readFromResultSet(ResultSet rs) throws SQLException{
 NhanVien model=new NhanVien();
 model.setMaNV(rs.getString("MaNV"));
 model.setMatKhau(rs.getString("MatKhau"));
 model.setHoTen(rs.getString("HoTen"));
 model.setVaiTro(rs.getBoolean("VaiTro"));
 return model;
 }

}
