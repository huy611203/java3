
package service;

import java.util.List;
import model.DongVat;


public interface DongVatService {
 void sortByNaMe(List<DongVat>lists); 
    List<DongVat>searchByNaMe(List<DongVat> listdongVats, String name);
}
