package b7.repository;

import b7.modle.GiangVien;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.AbstractList;
import java.util.ArrayList;

public class GiangVien_repository {

    public List<GiangVien> getALL() {
        //b1:viet query
        String query = "SELECT [ma_GV]\n"
                + "      ,[ten_GV]\n"
                + "      ,[loai]\n"
                + "      ,[tuoi]\n"
                + "      ,[bac]\n"
                + "      ,[gioi_tinh]\n"
                + "  FROM [dbo].[GiangVien]";
        //b2:Mo conexttion
        // connexttion: la 1 inteface cung cap tat ca cac menthod dung de giao tiep vs DB
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            // Statement: la 1 interface cho phep gui cac cau len SQL toi DB
            ResultSet rs = ps.executeQuery();
            //ResultSet: dai dien de hung ket qua ra cua cau query
            //b4: tao ra 1 list de convert tu result => list
            List<GiangVien> listGV = new ArrayList<>();
            while (rs.next()) {
                GiangVien gv = new GiangVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5), rs.getString(6));
                listGV.add(gv);
            }
            return listGV;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    public GiangVien getOne(String maGV) {
        String query = "SELECT [ma_GV]\n"
                + "      ,[ten_GV]\n"
                + "      ,[loai]\n"
                + "      ,[tuoi]\n"
                + "      ,[bac]\n"
                + "      ,[gioi_tinh]\n"
                + "  FROM [dbo].[GiangVien] ";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maGV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GiangVien gv = new GiangVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getBoolean(5), rs.getString(6));
                return gv;
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(GiangVien gv) {
        String query = "INSERT INTO [dbo].[GiangVien]\n"
                + "           ([ma_GV]\n"
                + "           ,[ten_GV]\n"
                + "           ,[loai]\n"
                + "           ,[tuoi]\n"
                + "           ,[bac]\n"
                + "           ,[gioi_tinh])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, gv.getMaGV());
            ps.setObject(2, gv.getTenGV());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.isGioiTinh());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[GiangVien]\n"
                + "      WHERE ma_GV = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
//[ma_GV] = ?\n"
//                + "      ,
    public boolean update(GiangVien gv, String maGV) {
        String query = "UPDATE [dbo].[GiangVien]\n"
                + "   SET [ten_GV] = ?\n"                   
                + "      ,[loai] = ?\n"
                + "      ,[tuoi] = ?\n"
                + "      ,[bac] = ?\n"
                + "      ,[gioi_tinh] = ?\n"
                + " WHERE ma_GV = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.getLoai());
            ps.setObject(3, gv.getTuoi());
            ps.setObject(4, gv.getBac());
            ps.setObject(5, gv.isGioiTinh());
            ps.setObject(6, maGV);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
       List<GiangVien> lists = new GiangVien_repository().getALL();
        for (GiangVien gv : lists) {
                    System.out.println(gv.toString());

        }
        
        
//          GiangVien gv = new GiangVien("01", "huy", "full_time", 18, true, "5");
//         boolean add = new GiangVien_repository().add(gv);
//         System.out.println(add);
    

//        GiangVien gv = new GiangVien("1", "hehe", "full_time", 18, true, "5");
//        boolean update = new GiangVien_repository().update(gv, "2");
//        System.out.println(update);
    }
}
