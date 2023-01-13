package buoi9_bai2;
import java.util.Scanner;
public class Circle implements IShape{
	private double radius;
	static Scanner sc=new Scanner(System.in);
	final double pi=3.14;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void input() {
		System.out.print("Nhap ban kinh: ");setRadius(sc.nextDouble());
	}
	public double getArea() {
		return this.radius*this.radius*pi;
	}
	public double getPerimeter() {
		return 2*pi*this.radius;
	}
}
