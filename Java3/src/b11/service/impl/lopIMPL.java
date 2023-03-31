package b11.service.impl;
import b11.model.Lop;
import b11.repository.lopRSTR;
import b11.service.lopService;
import java.util.List;
public class lopIMPL implements lopService{
    lopRSTR r = new lopRSTR();
    @Override
    public List<Lop> getAll() {
        return r.getAll();
    }
    
}
