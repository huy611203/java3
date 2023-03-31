package b7.modle;
public class GiangVien {
    private String maGV;
    private String tenGV;
    private String loai;
    private int tuoi;
    private boolean gioiTinh;
    private String bac;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, String loai, int tuoi, boolean gioiTinh, String bac) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.loai = loai;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.bac = bac;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", tenGV=" + tenGV + ", loai=" + loai + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", bac=" + bac + '}';
    }

    public Object[] rowData(){
        return new Object[]{
            maGV,
            tenGV,
            loai,
            tuoi,
            gioiTinh,
            bac
        };
    }
}
