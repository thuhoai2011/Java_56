package buoi9_bai1;

public class XeDap extends PhuongTienDiChuyen{
	
	public XeDap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XeDap(String loaiPhuongTien, HangSanXuat hangSanXuat) {
		super(loaiPhuongTien, hangSanXuat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double layVanToc() {
		return Math.random();
	}
	@Override 
	public String toString() {
		return super.toString()+"\t"+this.layVanToc();
	}
}
