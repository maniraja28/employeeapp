package com.employee;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Test {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scanner.nextLine();
		//if(name==null||name.length()==0) {
		
		
		if(StringUtils.isEmpty(name)) {
			System.out.println("Name is invalid");
		}else {
			System.out.println(name);
			
		}
		System.out.println("Program Ended");

	}
}
