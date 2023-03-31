package b10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SinhVienReponsitory {

    public List<SinhVien> getALL() {
        String query = "SELECT dbo.Lop.Ma_Lop, dbo.sinhVien.MaSinhVien, dbo.sinhVien.GioiTinh, dbo.sinhVien.Ten, dbo.sinhVien.CMND, dbo.sinhVien.DienThoai, dbo.sinhVien.Email\n"
                + "FROM     dbo.Lop INNER JOIN\n"
                + "                  dbo.sinhVien ON dbo.Lop.Ma_Lop = dbo.sinhVien.MaLop";
        try ( Connection conn = sqlServer.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<SinhVien> listSV = new ArrayList<>();
            while (rs.next()) {
                lop Lp = new lop(rs.getString(2));
//             SinhVien sv = new SinhVien(rs.getInt(1), rs.getBoolean(2), Lp, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
//            SinhVien sv = new SinhVien(Lp, 0, true, 0, query, query, query, query)
//                SinhVien sv = new SinhVien(rs.getInt(1), rs.getBoolean(2), Lp, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                SinhVien sv = new SinhVien(rs.getInt(1), rs.getBoolean(2), Lp, rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));

                listSV.add(sv);
            }
            return listSV;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<SinhVien> sv = new SinhVienReponsitory().getALL();
        for (SinhVien sinhVien : sv) {
            System.out.println(sinhVien.toString());
        }
    }
}
