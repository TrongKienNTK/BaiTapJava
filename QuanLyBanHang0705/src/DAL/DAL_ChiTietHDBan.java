/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author trong
 */
public class DAL_ChiTietHDBan {
    public static ArrayList<DTO_ChiTietHDBan> getAll(){
        Connection con = DBConnect.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "select * from tblChiTietHDBan";
                ResultSet rs = stmt.executeQuery(sql);
                ArrayList<DTO_ChiTietHDBan> ds = new ArrayList<>();
                while(true){
                    if(!rs.next()) break;
                    String MaHDBan = rs.getString("MaHDBan");
                    String MaHang = rs.getString("MaHang");
                    int SoLuong = rs.getInt("SoLuong");
                    int DonGia = rs.getInt("DonGia");
                    int GiamGia = rs.getInt("GiamGia");
                    int ThanhTien = rs.getInt("ThanhTien");
                    DTO_ChiTietHDBan chiTiet = new DTO_ChiTietHDBan(MaHDBan, MaHang,SoLuong, DonGia, GiamGia, ThanhTien);
                    ds.add(chiTiet);
                }
                con.close();
                return ds;
            }catch(SQLException ex){
                return null;
            }
        }
        return null;
    }
    
    public static int Insert(String MaHDBan, String MaHang, float SoLuong,float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect.KetNoi();
        if(con != null){
            try{
               Statement stmt = con.createStatement();
               String sql = "insert into tblChiTienHDBan(MaHDBan, MaHang, SoLuong,DonGia,GiamGia,ThanhTien) values ('"+ MaHDBan +"','"+ MaHang +"',"+ SoLuong +","+ DonGia +","+ GiamGia +","+ ThanhTien +")";
               int rs = stmt.executeUpdate(sql);
               if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Update(String MaHDBan, String MaHang, float SoLuong, float DonGia,float GiamGia,float ThanhTien){
        Connection con = DBConnect.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String Sql = "update tblChiTietHDBan set SoLuong = "+ SoLuong +",DonGia = "+ DonGia +",GiamGia="+ GiamGia +",ThanhTien = "+ ThanhTien +" where MaHDBan = '"+ MaHDBan +"' and MaHang='"+MaHang+"'";
                int rs = stmt.executeUpdate(Sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
    }
    
    public static int Delete(String MaHDBan){
        Connection con = DBConnect.KetNoi();
        if(con != null){
            try{
                Statement stmt = con.createStatement();
                String sql = "delete from tblChiTietHDBan where MaHDBan = '"+MaHDBan+"'";
                int rs = stmt.executeUpdate(sql);
                if(rs < 1){
                   con.close();
                   return 0;
               } else {
                   con.close();
                   return 1;
               }
            } catch (SQLException ex){
                return 0;
            }
        }
        return 0;
}
}
