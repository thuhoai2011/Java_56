package DAO;

import model.NhanVien;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {
	public void themNV(NhanVien nv, String username) throws SQLException{
		String sql="INSERT INTO NhanVien VALUES(?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, nv.getMaNV());
		preparedStatement.setString(2, nv.getTenNV());
		preparedStatement.setInt(3, nv.getTuoiNV());
		preparedStatement.setString(4, nv.getDiaChiNV());
		preparedStatement.setString(5, username);
		preparedStatement.executeUpdate();
	}
	
	public void suaThongTinNV(NhanVien nv, String username) throws SQLException{
		String sql="UPDATE NhanVien SET tenNV=?, tuoiNV=?, diaChiNV=? WHERE username=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, nv.getTenNV());
		preparedStatement.setInt(2, nv.getTuoiNV());
		preparedStatement.setString(3, nv.getDiaChiNV());
		preparedStatement.setString(4, username);
		preparedStatement.executeUpdate();
	}
	
	public void xoaNV(String maNV) {
		try {
			String sql="DELETE FROM NhanVien WHERE maNV=?";
			PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
			preparedStatement.setString(1, maNV);
			preparedStatement.executeUpdate();
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public List<NhanVien> dsNV() throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien a = new NhanVien();
			a.setMaNV(resultSet.getString("maNV"));
			a.setTenNV(resultSet.getString("tenNV"));
			a.setTuoiNV(resultSet.getInt("tuoiNV"));
			a.setDiaChiNV(resultSet.getString("diaChiNV"));
			a.setUsername(resultSet.getString("username"));
			listNV.add(a);
		}
		return listNV;
	}
	
	public NhanVien timMaNV(String maNV) throws SQLException{
		String sql="SELECT * FROM NhanVien WHERE maNV=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, maNV);
		ResultSet resultSet = preparedStatement.executeQuery();
		NhanVien nv = new NhanVien();
		while(resultSet.next()) {
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			return nv;
		}
		return null;
	}
	
	public List<NhanVien> timTenNV(String tenNV) throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien WHERE tenNV LIKE ?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, "%"+" "+tenNV);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien nv = new NhanVien();
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			listNV.add(nv);
		}
		return listNV;
	}
	
	public List<NhanVien> timTuoiNV(int tuoiNV) throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien WHERE tuoiNV=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setInt(1, tuoiNV);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien nv = new NhanVien();
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			listNV.add(nv);
		}
		return listNV;
	}
	
	public List<NhanVien> timDiaChiNV(String diaChiNV) throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien WHERE diaChiNV LIKE ?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, "%"+diaChiNV+"%");
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien nv = new NhanVien();
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			listNV.add(nv);
		}
		return listNV;
	}
	
	public List<NhanVien> sxNV_ten() throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien ORDER BY tenNV";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien nv = new NhanVien();
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			listNV.add(nv);
		}
		return listNV;
	}
	
	public List<NhanVien> sxNV_tuoi() throws SQLException{
		List<NhanVien> listNV = new ArrayList<>();
		String sql="SELECT * FROM NhanVien ORDER BY tuoiNV";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			NhanVien nv = new NhanVien();
			nv.setMaNV(resultSet.getString("maNV"));
			nv.setTenNV(resultSet.getString("tenNV"));
			nv.setTuoiNV(resultSet.getInt("tuoiNV"));
			nv.setDiaChiNV(resultSet.getString("diaChiNV"));
			nv.setUsername(resultSet.getString("username"));
			listNV.add(nv);
		}
		return listNV;
	}
	
	public static String getTenNV(String username) {
	    try {
	      String sql = "SELECT tenNV FROM NhanVien WHERE " + "username = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

	      preparedStatement.setString(1, username);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getString("tenNV");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return null;
	  }

	  public static String getMaNV(String username) {
	    try {
	      String sql = "SELECT maNV FROM NhanVien WHERE username = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
	      preparedStatement.setString(1, username);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getString("maNV");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return null;
	  }
	  
	public static void updatePassword(String username, String password) {
		String sql="UPDATE Account SET password=? WHERE username=?";
		try {
			PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, username);
			int a = preparedStatement.executeUpdate();
			if(a==1) System.out.println("Cap nhat thanh cong!");
			else System.out.println("check lai username cua ban!");
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
}
