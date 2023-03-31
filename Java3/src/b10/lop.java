
package b10;

public class lop {
    private int Ma_lop;
    private String Ten_lop;

    public lop() {
    }

    public lop(String Ten_lop) {
        this.Ten_lop = Ten_lop;
    }

    public lop(int Ma_lop, String Ten_lop) {
        this.Ma_lop = Ma_lop;
        this.Ten_lop = Ten_lop;
    }

    public int getMa_lop() {
        return Ma_lop;
    }

    public void setMa_lop(int Ma_lop) {
        this.Ma_lop = Ma_lop;
    }

    public String getTen_lop() {
        return Ten_lop;
    }

    public void setTen_lop(String Ten_lop) {
        this.Ten_lop = Ten_lop;
    }

    @Override
    public String toString() {
        return "lop{" + "Ma_lop=" + Ma_lop + ", Ten_lop=" + Ten_lop + '}';
    }
    
    public Object[] todataRow(){
        return new Object[]{
            Ma_lop,
            Ten_lop   
        }; 
    }
}
