package DAO;

import model.SanPham;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDAO {
	public void themSP(SanPham sp) throws SQLException{
		String sql="INSERT INTO SanPham VALUES(?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, sp.getMaSP());
		preparedStatement.setString(2, sp.getTenSP());
		preparedStatement.setInt(3, sp.getGiaBan());
		preparedStatement.setInt(4, sp.getSoLuongBan());
		preparedStatement.setInt(5, sp.getSoLuongKho());
		preparedStatement.executeUpdate();
	}
	
	public void suaThongTinSP(SanPham sp, String maSP) throws SQLException{
		String sql="UPDATE SanPham SET tenSP=?, giaBan=?, soLuongBan=?, soLuongKho=? WHERE maSP=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, sp.getTenSP());
		preparedStatement.setInt(2, sp.getGiaBan());
		preparedStatement.setInt(3, sp.getSoLuongBan());
		preparedStatement.setInt(4, sp.getSoLuongKho());
		preparedStatement.setString(5, maSP);
		preparedStatement.executeUpdate();
	}
	
	public void xoaSP(String maSP) {
		try {
			String sql="DELETE FROM SanPham WHERE maSP=?";
			PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
			preparedStatement.setString(1, maSP);
			preparedStatement.executeUpdate();
		}catch(SQLException throwables) {
			throwables.printStackTrace();
		}
	}
	
	public List<SanPham> dsSP() throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT * FROM SanPham";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public SanPham timMaSP(String maSP) throws SQLException{
		String sql="SELECT * FROM SanPham WHERE maSP=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, maSP);
		ResultSet resultSet = preparedStatement.executeQuery();
		SanPham sp = new SanPham();
		while(resultSet.next()) {
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			return sp;
		}
		return null;
	}
	
	public List<SanPham> timTenSP(String tenSP) throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT * FROM SanPham WHERE tenSP=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setString(1, tenSP);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public List<SanPham> sxSP_giaBan() throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT * FROM SanPham ORDER BY giaBan";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public List<SanPham> sxSP_soLuongBan() throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT * FROM SanPham ORDER BY soLuongBan";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public List<SanPham> sxSP_soLuongKho() throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT * FROM SanPham ORDER BY soLuongKho";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public List<SanPham> top3SP() throws SQLException{
		List<SanPham> listSP = new ArrayList<>();
		String sql="SELECT TOP 3 * FROM SanPham ORDER BY soLuongBan DESC";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			SanPham sp = new SanPham();
			sp.setMaSP(resultSet.getString("maSP"));
			sp.setTenSP(resultSet.getString("tenSP"));
			sp.setGiaBan(resultSet.getInt("giaBan"));
			sp.setSoLuongBan(resultSet.getInt("soLuongBan"));
			sp.setSoLuongKho(resultSet.getInt("soLuongKho"));
			listSP.add(sp);
		}
		return listSP;
	}
	
	public void muasp(SanPham sp, String maSP) throws SQLException{
		String sql="UPDATE SanPham SET soLuongBan=?, soLuongKho=? WHERE maSP=?";
		PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);
		preparedStatement.setInt(1, sp.getSoLuongBan());
		preparedStatement.setInt(2, sp.getSoLuongKho());
		preparedStatement.setString(3, maSP);
		preparedStatement.executeUpdate();
	}
	
	public int getSoLuongKho(String maSP) {
	    try {
	      String sql = "SELECT soLuongKho FROM SanPham WHERE " + "maSP = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

	      preparedStatement.setString(1, maSP);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getInt("soLuongKho");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return 0;
	  }
	
	public int getSoLuongBan(String maSP) {
	    try {
	      String sql = "SELECT soLuongBan FROM SanPham WHERE " + "maSP = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

	      preparedStatement.setString(1, maSP);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getInt("soLuongBan");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return 0;
	  }
	
	public int getGiaBan(String maSP) {
	    try {
	      String sql = "SELECT giaBan FROM SanPham WHERE " + "maSP = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

	      preparedStatement.setString(1, maSP);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getInt("giaBan");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return 0;
	  }
	
	public String getTenSP(String maSP) {
	    try {
	      String sql = "SELECT tenSP FROM SanPham WHERE " + "maSP = ?";
	      PreparedStatement preparedStatement = JDBCConnector.getJDBCConnection().prepareStatement(sql);

	      preparedStatement.setString(1, maSP);
	      ResultSet resultSet = preparedStatement.executeQuery();
	      while (resultSet.next()) {
	        return resultSet.getString("tenSP");
	      }
	    } catch (SQLException throwables) {
	      throwables.printStackTrace();
	    }
	    return null;
	  }
}
