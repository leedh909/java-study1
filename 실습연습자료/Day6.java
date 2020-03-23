package firstjava;
import java.util.Random;
import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
public class Day6 {

	
	public static void main(String[] args) {
	
		//18-2 예외 상황 처리
//		System.out.println("나이를 입력하시오: ");
//		
//		try {
//			int age=readAge();
//			System.out.println("당신은"+age+"세입니다.");
//		}catch(AgeInputException e){
//			System.out.println(e.getMessage());
//		}
		
		//인스턴스 비교 (참조값 비교)
//		IntNumber num1=new IntNumber(10);
//		IntNumber num2=new IntNumber(12);
//		IntNumber num3=new IntNumber(10);
//		
//		if(num1.isEquals(num2))
//			System.out.println("num1과 num2는 동일한 정수");
//		else
//			System.out.println("num1과 num2는 다른 정수");
//		if(num1.isEquals(num3))
//			System.out.println("num1과 num3는 동일한 정수");
//		else
//			System.out.println("num1과 num3는 다른 정수");
		

		//난수 생성 
		Random rand = new Random();
		for(int i=0;i<100;i++) {
			System.out.println(rand.nextInt(1000));
		}
	
	}
	public static int readAge() throws AgeInputException{
		Scanner Keyboard = new Scanner(System.in);
		int age = Keyboard.nextInt();
		if(age<0) {
			AgeInputException excpt=new AgeInputException();
			throw excpt;
		}
		return age;
	}

}

class IntNumber{
	int num;
	public IntNumber(int num) {this.num=num;}
	public boolean isEquals(IntNumber numObj) {
		if(this.num==numObj.num)
			return true;
		else
			return false;
		}
}
