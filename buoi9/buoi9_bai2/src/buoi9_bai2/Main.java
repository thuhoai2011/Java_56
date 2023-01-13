package buoi9_bai2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Nhap hcn");
		Rectangle rectangle = new Rectangle();
		rectangle.input();
		System.out.println("Dien tich: "+rectangle.getArea());
		System.out.println("Chu vi: "+rectangle.getPerimeter());
		
		System.out.println("Nhap htron");
		Circle circle = new Circle();
		circle.input();
		System.out.println("Dien tich: "+circle.getArea());
		System.out.println("Chu vi: "+circle.getPerimeter());
	}
	
}
