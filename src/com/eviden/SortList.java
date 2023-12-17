package com.eviden;

import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		int[] list= {5,2,4,8,9,6,7,3};
		Arrays.stream(list).sorted().forEach(System.out::print);

	}

}
