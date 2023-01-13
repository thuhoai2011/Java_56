package buoi9_bai1;

public abstract class PhuongTienDiChuyen {
	protected String loaiPhuongTien;
	protected HangSanXuat hangSanXuat = new HangSanXuat();
	
	public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.loaiPhuongTien = loaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	
	public PhuongTienDiChuyen() {
	}
	
	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String layTenHangSanXuat() {
		return hangSanXuat.getTenHangSanXuat();
	}
	public void batDau() {
		System.out.println("bat dau");
	}
	public void tangToc() {
		System.out.println("tang toc");
	}
	public void dungLai() {
		System.out.println("dung lai");
	}
	public abstract double layVanToc();
	@Override
	public String toString() {
		return loaiPhuongTien+"\t"+hangSanXuat;
	}
}
