package com.eviden;

import java.util.ArrayList;
import java.util.List;

interface practice2{
	public void run2();
}

interface practice3{
	public void run3();
}

interface practice extends practice2,practice3{
	public void run();
	
}
class going{
	
}
class going1{
	
}
abstract class venky extends going{
	public static void fun() {
	}
	public void running() {
	}
}

public class Test {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);	// TODO Auto-generated method stub
		list.add(10);
		list.add(10);
		list.add(52);
		System.out.println(list);
		list.get(5);
	}

}
