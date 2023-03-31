
package b10;

public class SinhVien {
  
  private int MaSinhVien;
  private boolean GioiTinh;
  private lop lop;
  private String Ten;
  private String CMND;
  private String DienThoai;
  private String Email;

    public SinhVien() {
    }

    public SinhVien(int MaSinhVien, boolean GioiTinh, lop lop, String Ten, String CMND, String DienThoai, String Email) {
        this.MaSinhVien = MaSinhVien;
        this.GioiTinh = GioiTinh;
        this.lop = lop;
       
        this.Ten = Ten;
        this.CMND = CMND;
        this.DienThoai = DienThoai;
        this.Email = Email;
    }

    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public lop getLop() {
        return lop;
    }

    public void setLop(lop lop) {
        this.lop = lop;
    }



    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MaSinhVien=" + MaSinhVien + ", GioiTinh=" + GioiTinh + ", lop=" + lop  + ", Ten=" + Ten + ", CMND=" + CMND + ", DienThoai=" + DienThoai + ", Email=" + Email + '}';
    }

   

    

    public Object[] todataRow(){
    return new Object[]{MaSinhVien,GioiTinh,Ten,CMND,DienThoai,Email};
}
}
