package com.kh.chap01_poly.practice02_electronic.controller;

import com.kh.chap01_poly.practice02_electronic.model.vo.Electronic;

// 다형성 개념을 적용했을 때!
public class ElectronicShop1 {
	
	Electronic[] elec = new Electronic[3];
	int count = 0;
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	public Electronic select(int index) {
		return elec[index];
	}

}
