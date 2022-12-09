package buoi5_bai1;

public class NhanVien {
	private int id,soNgayLam,namVao,phuCap;
	private String hoTen,kieuNV;
	public NhanVien() {
	}
	public NhanVien(int id, int soNgayLam, int namVao, int phuCap, String hoTen, String kieuNV) {
		this.id=id;
		this.hoTen=hoTen;
		this.kieuNV=kieuNV;
		this.soNgayLam=soNgayLam;
		this.namVao=namVao;
		this.phuCap=phuCap;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSoNgayLam() {
		return soNgayLam;
	}
	public void setSoNgayLam(int soNgayLam) {
		this.soNgayLam = soNgayLam;
	}
	public int getNamVao() {
		return namVao;
	}
	public void setNamVao(int namVao) {
		this.namVao = namVao;
	}
	public int getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(int phuCap) {
		this.phuCap = phuCap;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getKieuNV() {
		return kieuNV;
	}
	public void setKieuNV(String kieuNV) {
		this.kieuNV = kieuNV;
	}
	public int luong() {
		String s1="San xuat";
		String s2="Van phong";
		if(s1.equalsIgnoreCase(this.kieuNV)==true) {
			return 350*(this.soNgayLam); 
		}
		else if(s2.equalsIgnoreCase(this.kieuNV)==true) {
			return 400*(this.soNgayLam);
		}
		return 0;
	}
	public int PC() {
		if(this.namVao==2022) return 100;
		else return (2022-this.namVao)*200+100;
	}
	public int tongTien() {
		return this.luong()+this.PC();
	}
	@Override
	public String toString() {
		return id+"\t"+hoTen+"\t"+kieuNV+"\t"+soNgayLam+"\t\t"+namVao+"\t\t"+luong()+"\t\t"+PC()+"\t"+tongTien();
	}
}
