package buoi9_bai1;

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super(loaiPhuongTien, hangSanXuat);
		// TODO Auto-generated constructor stub
	}

	public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(loaiPhuongTien, hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public void catCanh() {
		System.out.println("may bay dang cat canh");
	}
	public void haCanh() {
		System.out.println("may bay dang ha canh");
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
