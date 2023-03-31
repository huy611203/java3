
package b10;

import b10.NewClass.SQLServiceReposiory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class NewClass1 {
    
    public List<lop> getAll() {
        String query = "select * from KhachHang";
        try ( Connection conn = SQLServiceReposiory.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<lop> listKhachHang = new ArrayList<>();
            while (rs.next()) {
                lop lp = new lop(
                        rs.getInt(1),
                        rs.getString(2)
                        );
                listKhachHang.add(lp);
            }
            return listKhachHang;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public lop getOne(String maKh) {
        String query = "select * from KhachHang where MaKh = ?";
        try ( Connection conn = SQLServiceReposiory.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, maKh);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lop kh = new lop(
                        rs.getInt(1),
                        rs.getString(2));
                return kh;
            }

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    public boolean add(lop lp) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([MaKH]\n"
                + "           ,[TenKH]\n"
                + "           ,[Tuoi]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[Loai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try ( Connection conn = SQLServiceReposiory.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, kh.getMaKh());
            ps.setObject(2, kh.getTenKh());
            ps.setObject(3, kh.getTuoi());
            ps.setObject(4, kh.isGioiTinh());
            ps.setObject(5, kh.getLoai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean update( lop kh,String ma) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET TenKH = ?,Tuoi = ?,GioiTinh = ?,Loai = ? "
                + " WHERE MaKh = ?";
        int check = 0;
        try ( Connection conn = sqlServer.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, kh.getTenKh());
            ps.setObject(2, kh.getTuoi());
            ps.setObject(3, kh.isGioiTinh());
            ps.setObject(4, kh.getLoai());
            ps.setObject(5, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean delete(String maKh) {
        String query = "DELETE FROM [dbo].[KhachHang]\n"
                + "      WHERE MaKh = ?";
        int check = 0;
        try ( Connection conn = SQLServiceReposiory.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, maKh);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public static void main(String[] args) {
    }
}
