package buoi9_bai1;

public class XeOto extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public XeOto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XeOto(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super(loaiPhuongTien, hangSanXuat);
		// TODO Auto-generated constructor stub
	}

	public XeOto(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	@Override
	public double layVanToc() {
		return Math.random();
	}
	@Override 
	public String toString() {
		return super.toString()+"\t"+loaiNhienLieu+"\t"+this.layVanToc();
	}
}
