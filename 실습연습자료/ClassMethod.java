package firstjava;

//2020.3.16
//10-2
//static 메소드의 정의와 호출

public class ClassMethod {

	public static void main(String[] args) {
		
		NumberPrinter.showInt(20); //클래스의 이름을 통한 호출
		NumberPrinter np=new NumberPrinter();
		np.showDouble(3.15); //인스턴스의 이름을 통한 호출
	}

}
class NumberPrinter{
	public static void showInt(int n) { System.out.println(n);}
	public static void showDouble(double n) {System.out.println(n);}
}
