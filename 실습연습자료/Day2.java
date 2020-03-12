package firstjava;

public class Day2 {

	public static void main(String[] args) {
	
		//1-3 첫 번째 자바 프로그램의 관찰과 응용
//		System.out.println(7);
//		System.out.println(3.15);
//		System.out.println("3+5="+8);
//		System.out.println(3.15+"는 실수입니다.");
//		System.out.println("3+5"+"의 연산결과는 8입니다.");
//		System.out.println(3+5);
		
		
		//2-1 변수의 이해와 활용
//		int num1;
//		num1=10;	
//		int num2=20;
//		int num3=num1+num2;
//		System.out.println(num1+"+"+num2+"="+num3);

//		double num1, num2, result;
//		num1=1.0000001;
//		num2=2.0000001;
//		result=num1+num2;
//		System.out.println(result);
		
		
		//2-4 자료형의 이해
//		 double e1=1.2e-3; //e-3은 10의 -3승을 의미한다.
//		 double e2=1.2e+3; //e+3은 10의 3승을 의미한다.
//		 
//		 int num1=0xA0E; //16진수
//		 int num2=0752; //8진수		
//		 System.out.println(e1);
//		 System.out.println(e2);
//		 System.out.println(num1);
//		 System.out.println(num2);
		
//		boolean b1=true;
//		boolean b2=false;
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(3<4);
//		System.out.println(3>4);
		

		//4-1 자바에서 제공하는 이항 연산자들
//		int n1=7;
//		int n2=3;
//		int result = n1+n2;
//		System.out.println("덧셈 결과 :"+result);
//		result=n1-n2;
//		System.out.println("뺄셈 결과:"+result);
//		System.out.println("곱셈 결과:"+n1*n2);
//		System.out.println("나눗셈 결과:"+n1/n2);
//		System.out.println("나머지 결과:"+n1%n2);
		
//		System.out.println("정수형 나눗셈 : "+ 7/3);
//		System.out.println("실수형 나눗셈 : "+ 7.0f/3.0f);
//		System.out.println("형 변환 나눗셈 : "+ (float)7/3);
		
//		System.out.println("정수형 나눗셈 : "+ 7%3);
//		System.out.println("실수형 나눗셈 : "+ 7.2 % 2.0); //이러한 문장은 만들지 말라.
		
//		double e=3.1;
//		e+=2.1;
//		e*=2;
//		int n=5;
//		n*=2.2;
//		System.out.println(e);
//		System.out.println(n);
		
//		int A=10, B=20;
//		if(true)
//			System.out.println("참 입니다.!");
//		else
//			System.out.println("거짓 입니다.!");
//		if(A>B)
//			System.out.println("A가 더 크다.!");
//		else
//			System.out.println("A가 더 크지 않다.!");
//		if(A!=B)
//			System.out.println("A와 B는 다르다.!");
//		else
//			System.out.println("A와 B는 같다.!");
		
//		int num1=10, num2=20;
//		boolean result1=(num1==10&&num2==20);
//		boolean result2=(num1<=12 || num2>=30);
//		System.out.println("num1==10 그리고 num2==20 : "+ result1);
//		System.out.println("num1<=12 또는 num2>=30 : "+ result2);
//		if(!(num1==num2))
//			System.out.println("num1과 num2는 같지 않다.");
//		else
//			System.out.println("num1과 num2는 같다.");
		
//		int num1=0, num2=0;
//		boolean result;
//		result=(num1+=10)<0 && (num2+=10)>0;
//		System.out.println("result="+result);
//		System.out.println("num1="+num1+", num2="+num2); //and 연산자에서 앞에거에서 이미 끝나면 뒤에걸 실행하지 않는다.
//		result = (num1+=10)>0 || (num2+=10)>0;
//		System.out.println("result="+result);
//		System.out.println("num1="+num1+", num2="+num2); //or 연산자에서 앞에거에서 이미 끝나면 뒤에걸 실행하지 않는다.
		
		
		//4-2 자바에서 제공하는 단항 연산자들
//		int n1=5;
//		System.out.println(+n1);
//		System.out.println(-n1);
//		short n2 =7;
//		int n3 =+n2;
//		int n4 = -n2;
//		System.out.println(n3);
//		System.out.println(n4);
		
//		int num1 = 7;
//		int num2, num3,num4,num5; 
//		num2 = num1++;
//		num3 = num1--;	
//		num4 = ++num1;	
//		num5 = --num1;	
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
		
		
		//4-3 비트와 관련이 있는 연산자들
//		int num1=5;
//		int num2=3;
//		int num3=-1;
//		System.out.println(num1 & num2);
//		System.out.println(num1 | num2);
//		System.out.println(num1 ^ num2);
//		System.out.println(~num3);
		
//		System.out.println(2<<1);
//		System.out.println(2<<2);
//		System.out.println(2<<3);
//		System.out.println(8>>1);
//		System.out.println(8>>2);
//		System.out.println(8>>3);
//		System.out.println(-8>>1);
//		System.out.println(-8>>2);
//		System.out.println(-8>>3);
//		System.out.println(-8>>>1);
	
		
		//5-1 if 그리고 else
//		int num=10;
//		if(num>0)
//			System.out.println("num은 0보다 크다.");
//		if((num%2)==0)
//			System.out.println("num은 짝수");
//		else
//			System.out.println("num은 홀수");
		
//		int num1=50,num2=100;
//		int big, diff;
//		big = (num1>num2) ? num1 : num2;
//		System.out.println(big);
//		diff = (num1>num2)? num1-num2 : num2-num1;
//		System.out.println(diff);
		
		
		//5-2 switch와 break
//		int n=3;
//		switch(n) //n의 값에 따라서 결과값이 달라진다. n의 결과값 영역 밑으로 다 실행
//		{
//		case 1:
//			System.out.println("Simple Java");
//		case 2:
//			System.out.println("Funny Java");
//		case 3:
//			System.out.println("Fantastic Java");
//		default :
//			System.out.println("The best programming language");
//		}
//		System.out.println("Do you like coffee?");
		
//		int n=3;
//		switch(n) //n의 값에 따라서 결과값이 달라진다. n의 결과값 영역만 실행
//		{
//		case 1:
//			System.out.println("Simple Java");
//			break;
//		case 2:
//			System.out.println("Funny Java");
//			break;
//		case 3:
//			System.out.println("Fantastic Java");
//			break;
//		default :
//			System.out.println("The best programming language");
//		}
//		System.out.println("Do you like coffee?");		
		
		
		//5-3 for, while 그리고 do~while
//		int num=0;
//		while(num<5) {
//			System.out.println("I like Java " + num);
//			num++;
//		}
		
//		int num=0;
//		do
//		{
//			System.out.println("I like Java " + num);
//			num++;
//		}while(num<5);
		
//		for(int i=0; i<3; i++) {
//			System.out.println("I like Java "+ i);
//		}
		
		
		//5-5 반복문의 중첩
//		for(int i=2;i<10;i++) { //구구단 2단에서 9단까지 출력한다.
//			for(int j=1;j<10;j++) {
//				System.out.println(i+" x "+j+" = "+i*j);
//			}
//		}
		
//		outerLoop : //레이블을 걸어서 반복하고 싶은 부분으로 돌아간다.
//			for(int i=1;i<10;i++) {
//				for(int j=1;j<10;j++) {
//					System.out.println("["+ i+", "+j+"]");
//					if(i%2==0 && j%2==0) 
//						break outerLoop;
//				}
//			}
		
		
		//6-1 메소드에 대한 이해와 메소드의 정의
//		System.out.println("프로그램의 시작");
//		double myHeight=175.9;
//		hiEveryone(12);
//		hiEveryone(13);
//		hiEveryone(12,12.5);		
//		hiEveryone(13,myHeight);		
//		hiEveryone();				
//		System.out.println("프로그램의 끝");
		
//		int result = adder(4,5);
//		System.out.println("4와 5의 합: "+ result);
//		System.out.println("3.5의 제곱: "+ square(3.5));
		
		
		//6-3 메소드의 재귀호출
		System.out.println("3 factorial : "+ factorial(3));
		System.out.println("12 factorial : "+ factorial(12));
		
		
		
	}
	
	public static void hiEveryone(int age) {
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는 "+age+"세 입니다.");
	}
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("저의 키는 "+height+"cm 입니다.");
	}
	public static void hiEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	public static int adder(int num1, int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	public static double square(double num) {
		return num*num;
	}
	public static int factorial(int n) {
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
}





