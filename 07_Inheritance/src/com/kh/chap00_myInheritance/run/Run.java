package com.kh.chap00_myInheritance.run;

import com.kh.chap00_myInheritance.model.vo.PostSeason;
import com.kh.chap00_myInheritance.model.vo.Ranking;
import com.kh.chap00_myInheritance.model.vo.Rating;

public class Run {

	public static void main(String[] args) {

		Rating rt = new Rating("기아타이거즈", 144, 75, 2, 67, 0.537);
		
		Ranking rk = new Ranking("키움히어로즈", 144, 83, 3, 58, "2위");
		
		PostSeason ps = new PostSeason("SSG랜더스", 144, 90, 2, 52, true);
		
		System.out.println("==================== 승률 계산해보기 ====================");
		System.out.println(rt.information());
		System.out.println();
		System.out.println("==================== 순위 확인해보기 ====================");
		System.out.println(rk.information());
		System.out.println();
		System.out.println("==================== 포스트시즌 진출여부 ====================");
		System.out.println(ps.information());
		System.out.println();
		
		System.out.println("==================== 수정한 이후 결과값 ====================");
		rk.setRank("2022 한국시리즈 준우승");
		System.out.println(rk.information());
	}

}
