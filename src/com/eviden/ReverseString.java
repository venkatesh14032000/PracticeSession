package com.eviden;

public class ReverseString {

	public static void main(String[] args) {
		String wish="Venkatesh Hello";
		StringBuilder str=new StringBuilder();
		char[] data=wish.toCharArray();
		int len= data.length;
		for(int i=data.length-1;i>=0;i--) {
			str=str.append(data[i]);
		}
		System.out.println(str);

	}

}
