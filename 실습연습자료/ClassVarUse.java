package firstjava;

//2020.3.16
//10-1
//static 변수의 활용 예

public class ClassVarUse {

	public static void main(String[] args) {
		
		Circle cl=new Circle(1.2);
		cl.showPerimeter();
		cl.showArea();

	}

}

class Circle{
	static final double PI=3.1415;
	private double radius;
	
	public Circle(double rad) { radius=rad;}
	public void showPerimeter() {
		double peri=(radius*2)*PI;
		System.out.println("둘레 : "+peri);
	}
	public void showArea() {
		double area=(radius*radius)*PI;
		System.out.println("넓이 : "+area);
	}
}