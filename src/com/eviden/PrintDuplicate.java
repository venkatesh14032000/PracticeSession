package com.eviden;

public class PrintDuplicate {
  public static void main(String[] args) {
	  String str="Venkateshnimmakanti";
	  int count = 0;
	  char[] store= str.toCharArray();
	  for(int i=0;i<store.length;i++) {
		  count=1;
		  for(int j=i+1;j<store.length;j++) {
			  if(store[i]==store[j]&&store[i]!=' ') {
				count++;
				store[j]='0';
			  }
		  }
		  if(count>1&&store[i]!='0')
			System.out.print(store[i]);
	  }
	}
}
