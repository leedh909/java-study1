package firstjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Day8 {

	public static void main(String[] args) {
		
		//22-3(1) 중복저장 안된다 예시
//		HashSet<String> hSet=new HashSet<String>();
//		hSet.add("First");
//		hSet.add("Second");
//		hSet.add("Third");
//		hSet.add("First");
//		
//		System.out.println("저장된 데이터 수 : "+hSet.size());
//		
//		Iterator<String> itr=hSet.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		//값은 같지만 중복으로 생각 안 할 때
//		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
//		hSet.add(new SimpleNumber(10));
//		hSet.add(new SimpleNumber(20));
//		hSet.add(new SimpleNumber(20));
//		
//		System.out.println("저장된 데이터 수 : "+hSet.size());
//		
//		Iterator<SimpleNumber> itr=hSet.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());

		
		//22-3(2)TreeSet<E>의 특징 : 출력순서가 정렬되어 있음에 주목!
//		TreeSet<Integer> sTree=new TreeSet<Integer>();
//		sTree.add(1);
//		sTree.add(2);
//		sTree.add(4);
//		sTree.add(3);
//		sTree.add(2);
//		System.out.println("저장된 데이터 수 : "+sTree.size());
//		Iterator<Integer> itr=sTree.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		//Person 클래스의 compareTo메소드는 정렬의 기준을 나이의 많고 적음으로 구현
		TreeSet<Person> sTree=new TreeSet<Person>();
		sTree.add(new Person("Lee",24));
		sTree.add(new Person("Hong",29));
		sTree.add(new Person("Choi",21));
		Iterator<Person> itr=sTree.iterator();
		while(itr.hasNext())
			itr.next().showData();
		
	}

}

class SimpleNumber{
	int num;
	public SimpleNumber(int n) {
		num=n;
	}
	public String toString() {
		return String.valueOf(num);
	}
	public int hashCode() {
		return num%3;
	}
	public boolean equals(Object obj) {
		SimpleNumber comp=(SimpleNumber)obj;
		if(comp.num==num)
			return true;
		else
			return false;
	}
}

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void showData()
    {
    	System.out.printf("%s %d \n", name, age);
    }
	public int compareTo(Person p) {
		if(age>p.age)
			return 1;
		else if(age<p.age)
			return -1;
		else
			return 0;
	}
	
}
