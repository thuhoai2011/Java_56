package buoi5_bai3;
import java.util.Comparator;
public class SinhVien {
	private int maSV,sdt;
	private float diem;
	private String hoTen, diaChi;
	public SinhVien() {
	}
	public SinhVien(int maSV, String hoTen, String diaChi, int sdt, float diem) {
		this.maSV=maSV;
		this.hoTen=hoTen;
		this.diaChi=diaChi;
		this.sdt=sdt;
		this.diem=diem;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return maSV+"\t"+hoTen+"\t"+diaChi+"\t"+sdt+"\t"+diem;
	}
	
}
