package com.webex.webapp;

public class Test {
	public static void main(String[] args){
		String s1 = "���,Java������";
		String s2 = new String("���,Java������");
		System.out.println(s1==s2.intern());
		System.out.println(s1.intern()==s2);
		System.out.println(s1.intern()==s2.intern()); 
	}
}
