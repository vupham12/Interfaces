package advance.dev;

import java.util.Scanner;

public class MainApp {
	
    static final int NUMBER_TRIANGLE = 4;
    static final int NUMBER_CIRCLE = 3;
    static final int NUMBER_RECTANGLE = 3;
    
	static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========Nhap hinh tam giac=========");
		int i=0;
		for (; i < NUMBER_TRIANGLE; i++) {
			System.out.println("hinh tam giac thu "+(i+1));
			System.out.println("Nhap a : ");
			double a = sc.nextDouble();
			System.out.println("Nhap b : ");
			double b = sc.nextDouble();
			System.out.println("Nhap c : ");
			double c = sc.nextDouble();
			Triangle triangle = new Triangle(a, b, c);
			shapes[i] = triangle;
		}
		System.out.println("=========Nhap hinh tron=========");
		for (; i < NUMBER_TRIANGLE + NUMBER_CIRCLE; i++) {
			System.out.println("hinh tron thu "+(i+1));
			System.out.println("Nhap r : ");
	        double r = sc.nextDouble();
			Circle circle = new Circle(r);
			shapes[i] = circle;
		}
		System.out.println("==========Nhap hinh chu nhat=========");
		for (; i < NUMBER_TRIANGLE + NUMBER_CIRCLE + NUMBER_RECTANGLE; i++) {
			System.out.println("hinh chu nhat thu "+(i+1));
			System.out.println("Nhap a : ");
			double a = sc.nextDouble();
			System.out.println("Nhap b : ");
			double b = sc.nextDouble();
			Rectangle rectangle = new Rectangle(a, b);
			shapes[i] = rectangle;
		}	
	}
	static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	static void findmaxDienTich(Shape[] shapes) {
		Shape preMax = shapes[0];
		for (int i = 0; i < shapes.length; i++) {
			if(preMax.dienTich() < shapes[i].dienTich()) {
				preMax=shapes[i];
			}
		}
		System.out.println("dien tich lon nhat la:"+preMax.dienTich());
	}
	static void findmax(Shape[] shapes) {
		Shape preTri = shapes[0];
		Shape preCir = shapes[0];
		Shape preRec = shapes[0];
		int i=0;
		for (; i < NUMBER_TRIANGLE; i++) {
		if(preTri.dienTich() < shapes[i].dienTich()) {
			preTri = shapes[i];
		}
	}
		System.out.println("dien tich hinh tam giac la : "+ preTri.dienTich());
		for (; i < NUMBER_CIRCLE; i++) {
		if(preCir.dienTich() < shapes[i].dienTich()) {
			preCir = shapes[i];
		}
	}
		System.out.println("dien tich hinh tron la : "+ preCir.dienTich());
		for (; i < NUMBER_RECTANGLE; i++) {
		if(preRec.dienTich() < shapes[i].dienTich()) {
			preRec = shapes[i];
		}
	}
		System.out.println("dien tich hinh chu nhat la : "+ preRec.dienTich());
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 Shape[] shapes = new Shape[NUMBER_TRIANGLE + NUMBER_CIRCLE + NUMBER_RECTANGLE];
		 input(shapes);
		 print(shapes);
		 findmaxDienTich(shapes);
		 findmax(shapes);
		}
}