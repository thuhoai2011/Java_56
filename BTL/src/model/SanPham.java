package model;

public class SanPham {
	private String maSP, tenSP;
	private int giaBan, soLuongBan, soLuongKho;
	public SanPham() {
	}
	public SanPham(String maSP, String tenSP, int giaBan, int soLuongBan, int soLuongKho) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaBan = giaBan;
		this.soLuongBan = soLuongBan;
		this.soLuongKho = soLuongKho;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuongBan() {
		return soLuongBan;
	}
	public void setSoLuongBan(int soLuongBan) {
		this.soLuongBan = soLuongBan;
	}
	public int getSoLuongKho() {
		return soLuongKho;
	}
	public void setSoLuongKho(int soLuongKho) {
		this.soLuongKho = soLuongKho;
	}
	
}
