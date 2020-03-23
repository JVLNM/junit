package com.epam.tdddemo;

public class removeA 
{
	public String removing(String remo)
	{
		if(remo.charAt(0)=='A' && remo.charAt(1)=='A')
		{
			remo=remo.substring(2,remo.length());
		}
		if(remo.charAt(0)=='A')
		{
			remo=remo.substring(1,remo.length());
		}
		if(remo.charAt(1)=='A')
		{
			remo=remo.substring(0,1)+remo.substring(2,remo.length());
		}
		return remo;
	}

}
