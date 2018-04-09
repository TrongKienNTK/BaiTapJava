package th0904.dssv;
public class SinhVien {
   private String hoTen;
   private int namSinh;
   private String gioiTinh;

    SinhVien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public String getHoTen(){
       return this.hoTen;
   }
   public int getNamSinh(){
       return this.namSinh;
   }
   public String getGioiTinh(){
       return this.gioiTinh;
   }

   public void setHoTen(String _HoTen){
       this.hoTen = _HoTen;
   }
   public void setNamSinh(int _NamSinh){
       this.namSinh = _NamSinh;
   }
   public void setGioiTinh(String _GioiTinh){
       this.gioiTinh = _GioiTinh;
   }

    void getNamSinh(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getNamSinh(int namSinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getGioiTinh(Boolean gioiTinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
