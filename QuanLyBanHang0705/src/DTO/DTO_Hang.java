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
public class DTO_Hang {

    private String MaHang;
    private String TenHang;
    private String MaChatLieu;
    private int SoLuong;
    private int DonGiaNhap;
    private int DonGiaBan;
    private String HinhAnh;
    private String GhiChu;

    public DTO_Hang(String MaHang, String TenHang, String MaChatLieu, int SoLuong, int DonGiaNhap, int DonGiaBan, String HinhAnh, String GhiChu) {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.MaChatLieu = MaChatLieu;
        this.SoLuong = SoLuong;
        this.DonGiaNhap = DonGiaNhap;
        this.DonGiaBan = DonGiaBan;
        this.HinhAnh = HinhAnh;
        this.GhiChu = GhiChu;
    }


    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getMaChatLieu() {
        return MaChatLieu;
    }

    public void setMaChatLieu(String MaChatLieu) {
        this.MaChatLieu = MaChatLieu;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(int DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    public int getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(int DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
