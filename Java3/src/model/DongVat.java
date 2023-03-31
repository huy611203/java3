package model;

public class DongVat {

    private String maDV;
    private String tenDV;
    private int canNang;
    private boolean gioiTinh;
    private String diaChi;

    public DongVat() {
        
    }

    public DongVat(String maDV, String tenDV, int canNang, boolean gioiTinh, String diaChi) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    //chuyedata => row
    public Object[]toDataROW(){
        return new Object[]{maDV,tenDV,canNang,gioiTinh== true ? "Duc": "Cai",diaChi};
    }

 
}
