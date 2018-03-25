package com.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {

	static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	public static void main(String[] args) throws ParseException {
		String myDate="06-02-2016";
		Date date = formatter.parse(myDate);
		
		
		System.out.println(date);
		//System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(myDate));
		

	}

}
