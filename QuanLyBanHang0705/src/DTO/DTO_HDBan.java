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
public class DTO_HDBan {

    private String MaHDBan;
    private String MaNhanVien;
    private String NgayBan;
    private String MaKhach;
    private int TongTien;

    public DTO_HDBan(String MaHDBan, String MaNhanVien, String NgayBan, String MaKhach, int TongTien) {
        this.MaHDBan = MaHDBan;
        this.MaNhanVien = MaNhanVien;
        this.NgayBan = NgayBan;
        this.MaKhach = MaKhach;
        this.TongTien = TongTien;
    }

    public String getMaHDBan() {
        return MaHDBan;
    }

    public void setMaHDBan(String MaHDBan) {
        this.MaHDBan = MaHDBan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public String getMaKhach() {
        return MaKhach;
    }

    public void setMaKhach(String MaKhach) {
        this.MaKhach = MaKhach;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
    
    
}
