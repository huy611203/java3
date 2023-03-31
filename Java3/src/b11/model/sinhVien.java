
package b11.model;
public class sinhVien {
    
    private int id;
    private String mssv;
    private String ten;
    private int maLopHoc;
    private int namSinh;

    public sinhVien() {
    }

    public sinhVien(int id, String mssv, String ten, int maLopHoc, int namSinh) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.maLopHoc = maLopHoc;
        this.namSinh = namSinh;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(int maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", mssv=" + mssv + ", ten=" + ten + ", maLopHoc=" + maLopHoc + ", namSinh=" + namSinh + '}';
    }
    
    public Object[] toRowData(){
        return new Object[]{id, mssv, ten, maLopHoc, namSinh};
    }
}
