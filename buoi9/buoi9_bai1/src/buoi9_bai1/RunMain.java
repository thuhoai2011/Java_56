package buoi9_bai1;
import java.util.ArrayList;
public class RunMain {

	public static void main(String[] args) {
		ArrayList<PhuongTienDiChuyen> pt = new ArrayList<>();
		//pt.add(new MayBay("Xang","May Bay",new HangSanXuat("Boeing", "USA")));
		//pt.add(new XeOto("Xang","O to", new HangSanXuat("honda","Japan")));
		//pt.add(new XeDap("Xe Dap", new HangSanXuat("Thong nhat", "VietNam")));
		
		HangSanXuat h1 = new HangSanXuat("Airbus", "Toulouse");
        HangSanXuat h2 = new HangSanXuat("Antonov", "Ukraina");
        HangSanXuat h3 = new HangSanXuat("Boeing", "USA");
        HangSanXuat h4 = new HangSanXuat("Mercedesc", "USA");
        HangSanXuat h5 = new HangSanXuat("Ferrari", "Italy");
        HangSanXuat h6 = new HangSanXuat("Merida", "Taiwan");

        pt.add(new MayBay("May Bay", h1, "Jet A"));
        pt.add(new MayBay("May Bay", h2, "Jet A"));
        pt.add(new MayBay("May Bay", h3, "Jet B"));

        pt.add(new XeOto("O to", h4, "Ron 95"));
        pt.add(new XeOto("O to", h5, "Ron 97"));

        pt.add(new XeDap("Xe dap", h6));
		double m=pt.get(0).layVanToc();
		for(int i=0; i<pt.size(); i++) {
			m=Math.max(pt.get(i).layVanToc(), m);
		}
		for(int i=0; i<pt.size(); i++) {
			if(m==pt.get(i).layVanToc())
				System.out.print("phuong tien co van toc lon nhat: "+ pt.get(i));
		}
	}

}
