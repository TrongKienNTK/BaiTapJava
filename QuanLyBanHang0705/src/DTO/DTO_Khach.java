/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author trong
 */
public class DTO_Khach {
    private String MaKhachHang;
    private String TenKhach;
    private String DiaChi;
    private String DienThoai;

    public DTO_Khach(String MaKhachHang, String TenKhach, String DiaChi, String DienThoai) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhach = TenKhach;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhach() {
        return TenKhach;
    }

    public void setTenKhach(String TenKhach) {
        this.TenKhach = TenKhach;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }
    
    
}
