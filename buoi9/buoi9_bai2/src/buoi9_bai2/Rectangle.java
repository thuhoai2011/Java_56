package buoi9_bai2;
import java.util.Scanner;
public class Rectangle implements IShape{
	private double length, width;
	static Scanner sc=new Scanner(System.in);
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public void input() {
		System.out.print("Nhap chieu dai: ");setLength(sc.nextDouble());
		System.out.print("Nhap chieu rong: ");setWidth(sc.nextDouble());
	}
	
	public double getArea() {
		return this.length*this.width;
	}
	
	public double getPerimeter() {
		return (this.length+this.width)*2;
	}
}
