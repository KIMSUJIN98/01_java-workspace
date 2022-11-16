package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class FileCharRun {

	public static void main(String[] args) {
		FileCharDao dao = new FileCharDao();
		//dao.fileSave(); 							// 콘솔창에 에러 없이 아무것도 안뜨는것이 정상! => 프로젝트를 F5 해보면 b_char.txt 파일이 생겼다.
		dao.fileRead();
		
	}

}
