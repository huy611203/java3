
package b11.model;
public class Lop {
     private int id;
    private String tenLopHoc;

    public Lop() {
    }

    public Lop(int id, String tenLopHoc) {
        this.id = id;
        this.tenLopHoc = tenLopHoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLopHoc() {
        return tenLopHoc;
    }

    public void setTenLopHoc(String tenLopHoc) {
        this.tenLopHoc = tenLopHoc;
    }

    @Override
    public String toString() {
        return "Lop{" + "id=" + id + ", tenLopHoc=" + tenLopHoc + '}';
    }
}
