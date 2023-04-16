package model;

public class NhanVien {
	private String maNV, tenNV, diaChiNV;
	private int tuoiNV;
	private String username;
	public NhanVien() {
	}
	
	public NhanVien(String maNV, String tenNV, String diaChiNV, int tuoiNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.diaChiNV = diaChiNV;
		this.tuoiNV = tuoiNV;
	}

	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getDiaChiNV() {
		return diaChiNV;
	}
	public void setDiaChiNV(String diaChiNV) {
		this.diaChiNV = diaChiNV;
	}
	public int getTuoiNV() {
		return tuoiNV;
	}
	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}
	public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }
}
