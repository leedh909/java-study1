package firstjava;

//2020.3.16
//10-1
//static 변수의 접근방법

public class ClassVarAccess {

	public static void main(String[] args) {

		AccessWay way=new AccessWay();
		way.num++; //인스턴스의 이름을 이용한 접근방법
		AccessWay.num++;
		System.out.println("num= "+AccessWay.num); //클래스의 이름을 이용한 접근방법
		
	}

}
class AccessWay{
	static int num=0;
	AccessWay(){
		incrCnt();
		
	}
	public void incrCnt() { num++;} //클래스 내부에서 접근
}