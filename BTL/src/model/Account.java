package model;

public class Account {
	private String username, password;
	private String role;
	private NhanVien nhanvien;
	public Account() {
	}
	public Account(String username, String password, NhanVien nhanvien) {
		super();
		this.username = username;
		this.password = password;
		this.nhanvien = nhanvien;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
	    return role;
	  }

	public void setRole(String role) {
		this.role = role;
	}
	public NhanVien getNhanvien() {
		return nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
	
}
