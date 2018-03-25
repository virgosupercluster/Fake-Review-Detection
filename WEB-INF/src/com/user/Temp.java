package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp
{
	public static String removehttplink(String part5) 
	
	
	{
		
		
		String part="http";
		if(part5.contains(part))
		{
		System.out.println("part5 is "+part5);
		String data=null;
		
		String s=part5;
		
		String tt[]=s.split("http");
		
		int spos=s.indexOf("http");
	
		
		String y=s.substring(spos);
		
		int epos=spos+y.indexOf(" ");
		
		System.out.println(y);
		
		spos=0;
		
		StringBuffer sb=new StringBuffer(s);
		
		sb=sb.delete(spos, epos);
		System.out.println(tt[0]+sb);
		data=tt[0]+sb.toString();
		System.out.println("data is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+tt[0]+sb);
		return data;
	}
	else
	{
		return part5;
		
	}
		
}
	public static  String removeUrl(String commentstr)
    {
        String urlPattern = "((https?|ftp|gopher|telnet|file|Unsure|http):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
        Pattern p = Pattern.compile(urlPattern,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(commentstr);
        int i = 0;
        while (m.find()) {
            commentstr = commentstr.replaceAll(m.group(i),"").trim();
            i++;
        }
        System.out.println("remaining data is"+commentstr);
        return commentstr;
    }	
	
}