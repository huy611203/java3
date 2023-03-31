package b11.service.impl;
import b11.model.sinhVien;
import b11.repository.sinhVienRSTR;
import b11.service.sinhVienService;
import java.util.List;

public class sinhVienIMPL implements sinhVienService{
    sinhVienRSTR  r = new sinhVienRSTR();
    @Override
    public List<sinhVien> getAll() {
        return r.GetAll();
    }
    
}
