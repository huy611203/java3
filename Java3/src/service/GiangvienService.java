package service;

import b7.modle.GiangVien;
import java.util.List;

public interface GiangvienService {
    List<GiangVien> getALL();
    GiangVien getOne(String maGV);
    String add(GiangVien gv);
    String delete(String gv);
    String update ( GiangVien gv, String magv);
}
