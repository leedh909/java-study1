package firstjava;

import java.util.NavigableSet;
import java.util.TreeMap;

import java.util.*;

public class IntroTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(1, "data1");		
		tMap.put(3, "data3");	
		tMap.put(5, "data5");	
		tMap.put(2, "data2");	
		tMap.put(4, "data4");	
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();
		//tMap에 정렬된 상태로 저장된 key값들을 참조하는 변수이다.=navi 
		
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr=navi.iterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		System.out.println("내림차순 출력...");
		itr=navi.descendingIterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	

	}

}
