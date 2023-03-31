
package model;

public class DongVat2 {
    private String maDV;
    private String tenDongVat;
    private int namSinh;
    private boolean gioitinh;

    public DongVat2() {
    }

    public DongVat2(String maDV, String tenDongVat, int namSinh, boolean gioitinh) {
        this.maDV = maDV;
        this.tenDongVat = tenDongVat;
        this.namSinh = namSinh;
        this.gioitinh = gioitinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    
    public Object[]TODATAROW (){
    return new Object[]{maDV,tenDongVat,namSinh,gioitinh == true ? "nam":"nu"};

}
}
