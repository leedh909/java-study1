package firstjava;

public class Day4 {

	public static void main(String[] args) {
		
		//11-1
		//군필과 미필의 구분
//		Person man = new Person(950123, 880102);
//		Person woman=new Person(941125);
//		man.showInfo();
//		woman.showInfo();
		
		//11-2
		//String 클래스의 인스턴스 생성
//		java.lang.String str = "My name is Sunny";
//		int strLen1=str.length();
//		System.out.println("길이 1 : "+strLen1);
//		int strLen2="한글의 길이는 어떻게?".length();
//		System.out.println("길이 2 : "+strLen2);
		
		//참조값 비교
//		String str1="My String";
//		String str2="My String";
//		String str3="Your String";
//		if(str1==str2)
//			System.out.println("동일 인스턴스 참조");
//		else
//			System.out.println("다른 인스턴스 참조");
		
		//String 클래스가 제공하는 유용한 메소드들
//		String str1="Smart";
//		String str2=" and ";
//		String str3="Simple";
//		String str4=str1.concat(str2).concat(str3);
//		System.out.println(str4);
//		System.out.println("문자열 길이 : "+str4.length());
//		if(str1.compareTo(str3)<0) //알파벳 순서 비교
//			System.out.println("str1이 앞선다.");
//		else
//			System.out.println("str3이 앞선다.");
		
		//+연산과+=연산의 진실
//		String str1=1+"Lemon"+2; //String.valueOf(1).concat("Lemon").concat("String.valueOf(2)) 값과 같다.
//		System.out.println(str1);
		
		
		//11-4
		//StringBuilder를 통해서 문자열을 저장 및 변경할 수 있다.
//		StringBuilder strBuf=new StringBuilder("AB");
//		strBuf.append(25);
//		strBuf.append('Y').append(true);
//		System.out.println(strBuf);
//		strBuf.insert(2, false);
//		strBuf.insert(strBuf.length(), 'z');
//		System.out.println(strBuf);
		
		//참조를 반환하는 메소드
		SimpleAdder adder=new SimpleAdder();
		adder.add(1).add(3).add(5).showResult();
		
		
		//12-1
		
	}
	
}

class SimpleAdder{
	private int num;
	public SimpleAdder() {num=0;}
	public SimpleAdder add(int num) {
		this.num+=num;
		return this;
	}
	public void showResult() {
		System.out.println("add result: "+num);
	}
}

//class Person
//{
//	private int perID;
//	private int milID;
//	private int birthYear;
//	private int birthMonth;
//	private int birthDay;
//	
//	public Person(int perID, int milID, int bYear, int bMonth, int bDay) { 
//		//생성자의 재호출을 위한 키워드 this
//		this.perID=perID;
//		this.milID=milID;
//		birthYear=bYear;
//		birthMonth=bMonth;
//		birthDay=bDay;
//	}
//	public Person(int pID, int bYear,int bMonth, int bDay) {
//		this(pID,0,bYear,bMonth,bDay);
//	}
//	
//	public Person(int pID, int mID) { //군 필자를 위한 생성자
//		perID=pID;
//		milID=mID;
//	}
//	public Person(int pID) { //군 미필자를 위한 생성자
//		perID=pID;
//		milID=0;
//		
//	}
//	public void showInfo() {
//		System.out.println("민번 : "+ perID);
//		if(milID!=0)
//			System.out.println("군번 : "+milID+'\n');
//		else
//			System.out.println("군과 관계없음 \n");
//	}
//}
