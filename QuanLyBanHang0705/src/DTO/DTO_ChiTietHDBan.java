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
public class DTO_ChiTietHDBan {
    private String MaHDBan;
    private String MaHang;
    private Integer SoLuong;
    private Integer DonGia;
    private Integer GiamGia;
    private Integer ThanhTien;

    public DTO_ChiTietHDBan(String MaHDBan, String MaHang, Integer SoLuong, Integer DonGia, Integer GiamGia, Integer ThanhTien) {
        this.MaHDBan = MaHDBan;
        this.MaHang = MaHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.GiamGia = GiamGia;
        this.ThanhTien = ThanhTien;
    }


    public String getMaHDBan() {
        return MaHDBan;
    }

    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Integer getDonGia() {
        return DonGia;
    }

    public void setDonGia(Integer DonGia) {
        this.DonGia = DonGia;
    }

    public Integer getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(Integer GiamGia) {
        this.GiamGia = GiamGia;
    }
    
    public Integer getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Integer ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
}
