package com.eviden;

import java.util.stream.Collectors;

public class Seperatealphanumerics {

	public static void main(String[] args) {
		String alphanumeric="2a22aa2aaaa2aa2a2222a";
		StringBuilder num= new StringBuilder();
		StringBuilder alpha= new StringBuilder();
		int count=0;
		int count1=0;
		for(int i=0;i<alphanumeric.length();i++) {
			if(Character.isDigit(alphanumeric.charAt(i))) {
				num.append(alphanumeric.charAt(i));
				count++;
			}
			if(Character.isAlphabetic(alphanumeric.charAt(i))) {
				alpha.append(alphanumeric.charAt(i));
				count1++;
			}
		}
		System.out.println("Total 2's are "+count);
		System.out.println("Total a's are "+count1);
		
		

	}

}
