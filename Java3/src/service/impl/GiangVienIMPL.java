
package service.impl;

import b7.modle.GiangVien;
import b7.repository.GiangVien_repository;
import java.util.List;
import service.GiangvienService;


public class GiangVienIMPL implements GiangvienService{
   private GiangVien_repository GV = new GiangVien_repository();
           
            
    @Override
    public List<GiangVien> getALL() {
     return GV.getALL();
    }

    @Override
    public GiangVien getOne(String maGV) {
    return GV.getOne(maGV);
    }

    @Override
    public String add(GiangVien gv) {
    //valide
        if (gv.getMaGV().isEmpty()) {
            return "ma trong";
        }
         if (gv.getTenGV().isEmpty()) {
            return "ten trong";
        }
         boolean addGiangVien = GV.add(gv);
         if(addGiangVien){
             return "add thanh cong";
         }else{
             return "add that bai";
         }
    }

    @Override
    public String delete(String gv) {
       return null;
    }

    @Override
    public String update(GiangVien gv, String magv) {
        return null;
    }
    
}
