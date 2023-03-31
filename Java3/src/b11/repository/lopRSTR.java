package b11.repository;

import b10.lop;
import b11.model.Lop;
import b11.service.lopService;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class lopRSTR {

    public List<Lop> getAll() {
        String query = "SELECT TOP (1000) [id]\n"
                + "      ,[ten_lop_hoc]\n"
                + "  FROM [LuyenTap].[dbo].[lop_hoc]";
        try(Connection con = rpstr.getConnection(); PreparedStatement ps = con.prepareStatement(query); ){
           ResultSet rs = ps.executeQuery();
            ArrayList<Lop> lp = new ArrayList<>();
            while(rs.next()){
                Lop LO = new Lop(1, rs.getString(2));
                lp.add(LO);
            }
            return lp;
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<Lop> lp = new lopRSTR().getAll();
        for (Lop lop : lp) {
            System.out.println(lp);
        }
    }
}
