package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music> 로 제네릭 설정함 E == Music
		//ArrayList list = new ArrayList();
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attenetion", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		// list.add("가보자고"); 다른 타입 담기 불가					// 제네릭 설정으로 인해 Music외의 자료형은 담기 불가
		
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);					// List도 제네릭으로 List<Music>과 같이 만들어줘야 한다.
		
		list.addAll(sub);										// <Music> 전용인 (ArrayList)list에 (List)sub가 이어붙고 다시 (ArrayList)list로 합쳐져야하기 때문에 List의 자료형도 Music으로 맞춰준다.
		
		System.out.println(list);
		
		Music m = list.get(0);									// list.get()이 제네릭 설정으로 인해 Object가 아닌 Music이므로 형변환없이 바로 Music으로 받아도 된다.
		System.out.println(m);
		
		System.out.println(list.get(1).getTitle());
		
		for(Music o : list) {
			System.out.println(o);
		}
		
		/*
		 * 제네릭<>을 사용하는 이유
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할때 매번 형변환 하는 절차를 없애기 위해
		 */
	}

}
