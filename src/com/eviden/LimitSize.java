package com.eviden;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class LimitSize {

	public static void main(String[] args) {
		double number = 12.49564;
		int aux = (int)(number*100);//1243
		double result = aux/100d;//12.43
		List<Double> list= new ArrayList<>();
		list.add(10.234d);
		list.add(10.5765d);
		list.add(10.49165d);
		list.add(10.7017859d);
		list.add(10.2249d);

		for(Double l1:list) {
			DecimalFormat df = new DecimalFormat("#.##");
			DecimalFormatSymbols dfs = new DecimalFormatSymbols();
			dfs.setDecimalSeparator('.');
			df.setDecimalFormatSymbols(dfs);
			System.out.println(df.format(l1));
		}
	}

}
