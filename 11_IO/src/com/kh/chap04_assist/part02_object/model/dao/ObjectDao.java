package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 ----> 파일 (출력)
	// 파일은 사실 우리가 보려고 관상용으로 만든다기 보다는 나중에 읽어오기 위해 만드는거임
	
	public void fileSave() {
		
		// 출력할 데이터 (Phone 객체)
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤럭시", 1200000);
		Phone ph3 = new Phone("플립", 1500000);
		
		// 객체 단위로 출력해줄 수 있는 보조스트림 필요!!
		
		// ObjectXXX => 얘는 Writer, Reader가 없음! 														// Writer, Reader 사용 불가하므로 ObjectWriter, ObjectReader 자체가 없다.
		
		// FileOutputStream : 파일과 연결해서 1바이트 단위로 출력할 수 있는 기반스트림 									// 기반스트림과 보조스트림은 이름을 맞춰줘야한다.
		// ObjectOutputStream : 객체 단위로 출력할 수 있도록 도움을 주는 보조스트림(ObjectWriter 없음!!)
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))){
			
			oos.writeObject(ph1);																		// 나중에 저장된 d_phone.txt 파일을 열어보면 알아볼 수 없는 문구로 작성되어있음 => 추후 파일을 읽어보면 출력이 제대로 나온다.
			oos.writeObject(ph2);
			oos.writeObject(ph3);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
		
			/*
			System.out.println(ois.readObject()); 														// phone 객체를 세개 만들었으므로 3번의 출력문 필요
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			System.out.println(ois.readObject()); // 파일의 끝을 만나는 순간 예외발생 EOF => End Of File			// 런타임 에러 발생 / readObject 메소드가 읽을 데이터가 없는 경우 null을 반환하지 않고, EOFException 예외를 반환하기 때문
			*/
			
			while(true) {
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {																		// EOF 만나는 순간 무한반복구문 빠져나오면서 끝남.
			System.out.println("파일을 다 읽어들였습니다."); 
			//e.printStackTrace(); 																		// 에러가 난 것이 아니라, 에러 내용을 보여줬던 것이다.
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
