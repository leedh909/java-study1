package firstjava;

import java.util.Scanner;

public class Day4_1 {

	public static void main(String[] args) {
		
		//12-1
//		Friend fnd1=new Friend("이종수");
//		Friend fnd2=new Friend("현주은");
//		System.out.println(fnd1);
//		System.out.println(fnd2);
//		System.out.print("출력이 ");
//		System.out.print("종료되었습니다.");
//		System.out.println("");
		
//		System.out.printf("정수는 %d, 실수는 %f, 문자는 %c",12,24.5,'A');

//		int age=20;
//		double tall=175.7;
//		String name="홍자바";
//		System.out.printf("제 이름은 %s입니다.\n",name);
//		System.out.printf("제 나이는 %d이고, 키는 %e입니다.\n",age,tall);
//		System.out.printf("%d %o %x \n",77,77,77);
//		System.out.printf("%g %g \n",0.00014, 0.000014);

		
		//12-2
//		String source="1 5 7";
//		Scanner sc=new Scanner(source);
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int num3=sc.nextInt();
//		int sum=num1+num2+num3;
//		System.out.printf("문자열에 저장된 %d,%d,%d의 합은 %d \n",num1,num2,num3,sum);
		
		
		//13-2
		//기본 자료형 배열
//		int[] arr= new int[3];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		int sum=arr[0]+arr[1]+arr[2];
//		System.out.println(sum);
		
		//인스턴스의 배열
//		String[] strArr=new String[3];
//		strArr[0]=new String("Java");
//		strArr[1]=new String("Flex");
//		strArr[2]=new String("Ruby");
//		for(int i=0;i<strArr.length;i++) {
//			System.out.println(strArr[i]);
//		}
		
		//배열과 메소드
//		int[] arr= {1,2,3,4,5};
//		int[] ref;
//		ref=addAllArray(arr,7);
//		if(arr==ref)
//			System.out.println("동일 배열 참조");
//		else
//			System.out.println("다른 배열 참조");
//		for(int i=0;i<ref.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
		
		
		//13-3
//		int[][] arr=new int[3][4];
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++)
//				arr[i][j]=i+j;
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++)
//				System.out.println(arr[i][j]+" ");
//			System.out.println("");
//		}
		
		
		//14-1
		//상속 관계에 있는 인스턴스의 생성 예
		BusinessMan man1=new BusinessMan("Mr.Hong","Hybrid 3D ELD", "Staff Eng.");
		BusinessMan man2=new BusinessMan("Mr.Lee", "Hybrid 3D ELD", "Assist Eng.");
		System.out.println("First man info............");
		man1.tellYourName();
		man1.tellYourInfo();
		System.out.println("Second man info............");
		man2.tellYourInfo();
	}

	
	
	
	
	
	
//	class Man
//	{//상위 클래스 , 기초 클래스
//		public String name;
//		public void tellYourName() {
//			System.out.println("My name is "+name);
//		}
//	}
//	class BusinessMan extends Man
//	{//하위 클래스, 유도 클래스
//		public String company;
//		public String position;
//		public void tellYourInfo() {
//			System.out.println("My company is "+company);
//			System.out.println("My position is "+position);
//			tellYourName(); //Man 클래스를 상속했기 때문에 호출 가능.
//		}
//	}
	
	
	
	
//	public static int[] addAllArray(int[] ar, int addVal) {
//		for(int i=0;i<ar.length;i++) {
//			ar[i]+=addVal;}
//		
//		return ar;
//		
//	}
//	
//	
//	class Friend
//	{
//		String myName;
//		public Friend(String name) {
//			myName=name;
//		}
//		public String toString() {
//			return "제 이름은 "+myName+"입니다.";
//		}
//	}
}
class Man
{//상위 클래스 , 부모 클래스
	private String name;
	public Man(String name) {this.name=name;}
	public void tellYourName() {
		System.out.println("My name is "+name);
	}
}
class BusinessMan extends Man
{//하위 클래스, 자식 클래스
	private String company;
	private String position;
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company=company;
		this.position=position;
	}
	public void tellYourInfo() {
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
		tellYourName(); //Man 클래스를 상속했기 때문에 호출 가능.
	}
}