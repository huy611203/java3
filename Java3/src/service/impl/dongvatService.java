
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.DongVat;
import service.DongVatService;


public class dongvatService {
    public class DongVatServiceImpl implements DongVatService{

    @Override
    public void sortByNaMe(List<DongVat> lists) {
        lists.sort((o1, o2)->{
        return o1.getTenDV().compareTo(o2.getTenDV());
    });
    }

    @Override
    public List<DongVat> searchByNaMe(List<DongVat> listdongVats, String name) {
    List<DongVat> listSearch = new ArrayList<>();
    //code
    for(DongVat dv:listdongVats){
        //check
        if(dv.getTenDV().contains(name)){
            //thêm vào list
            listSearch.add(dv);
            }
    }
    return listSearch;
    }
    
}
}
