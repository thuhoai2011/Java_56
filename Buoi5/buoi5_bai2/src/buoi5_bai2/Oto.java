package buoi5_bai2;

public class Oto {
	private String chuSoHuu, tenXe, hang;
	private int gia, namMua;
	public Oto() {
	}
	public Oto(String chuSoHuu, String tenXe, String hang, int gia, int namMua) {
		this.chuSoHuu=chuSoHuu;
		this.tenXe=tenXe;
		this.hang=hang;
		this.gia=gia;
		this.namMua=namMua;
	}
	public String getChuSoHuu() {
		return chuSoHuu;
	}
	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getNamMua() {
		return namMua;
	}
	public void setNamMua(int namMua) {
		this.namMua = namMua;
	}
	public double giaTri() {
		if(this.gia < 1000000) 
			return (this.gia)-((this.gia)*0.07*(this.namMua));
		else if(this.gia >= 1000000 && this.gia <= 2000000)
			return (this.gia)-((this.gia)*0.05*(this.namMua));
		else
			return (this.gia)-((this.gia)*0.03*(this.namMua));
	}
	@Override
	public String toString() {
		return chuSoHuu+"\t"+tenXe+"\t\t"+hang+"\t\t"+gia+"\t\t"+namMua+"\t"+giaTri();
	}
}
