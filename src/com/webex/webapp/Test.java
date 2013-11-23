package com.webex.webapp;

public class Test {
	public static void main(String[] args){
		String s1 = "你好,Java自由人";
		String s2 = new String("你好,Java自由人");
		System.out.println(s1==s2.intern());
		System.out.println(s1.intern()==s2);
		System.out.println(s1.intern()==s2.intern()); 
	}
}
