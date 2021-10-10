package ConstructorConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowserClass {
	
	String browserName;
	String vendorName;
	int currentversion;
	List<String> al = new ArrayList<String>();
	
	public BrowserClass(String browserName,String vendorName,int currentversion,List<String> al)
	{
		this.browserName=browserName;
		this.vendorName=vendorName;
		this.currentversion=currentversion;
		this.al=al;
	}
	
	public BrowserClass(String browserName,int currentversion)
	{
		this.browserName=browserName;
		this.currentversion=currentversion;
	}
	
	public BrowserClass(int currentversion)
	{
		this.currentversion=currentversion;
	}
	
	public BrowserClass(String browserName,String vendorName,int currentversion)
	{
		this.browserName=browserName;
		this.vendorName=vendorName;
		this.currentversion=currentversion;
		//this.al=al;
	}
	
	public String getBrowsername()
	{
		return browserName;
	}
	
	public String getvendorName()
	{
		return vendorName;
	}
	
	public int getcurrentversion()
	{
		return currentversion;
	}
	
	public List<String> getExtension()
	{
		return al;
	}
	
	public static void main(String[] args)
	{
		BrowserClass br = new BrowserClass("Chrome", "Mark", 83, new ArrayList<String>(Arrays.asList("ABC.ext","DEF.ext","GHi.ext")));
		
	}

}
