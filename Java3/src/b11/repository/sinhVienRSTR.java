package b11.repository;

import b11.model.sinhVien;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;

public class sinhVienRSTR {

    public List<sinhVien> GetAll() {
        String query = "SELECT TOP (1000) [id]\n"
                + "      ,[mssv]\n"
                + "      ,[ten]\n"
                + "      ,[ma_lop_hoc]\n"
                + "      ,[nam_sinh]\n"
                + "  FROM [LuyenTap].[dbo].[sinh_vien]";
        try ( Connection con = rpstr.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            ArrayList<sinhVien> svlist = new ArrayList<>();
            while (rs.next()) {
                sinhVien sv = new sinhVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                svlist.add(sv);
            }
            return svlist;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<sinhVien> sv = new sinhVienRSTR().GetAll();
        for (sinhVien vien : sv) {
            System.out.println(sv);
        }

    }
}
