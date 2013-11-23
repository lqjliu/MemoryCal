package com.webex.webapp;

import java.util.Date;

import sizeof.agent.SizeOfAgent;

public class Memory {
	private final static int _SIZE = 200000;

	public static void main(String[] args) throws Exception {
//		MemoryBean mb = new MemoryBean();
//		mb.setIntfield(1);
/*		mb.setLongfield(2);
		mb.setStringfield("This is a test");*/
//		System.out.println("mb size = " + SizeOfAgent.sizeOf(mb));
//		System.out.println("mb size = " + SizeOfAgent.fullSizeOf(mb));
	
		
//		MemoryBean1 mb11 = new MemoryBean1();
//		mb11.setIntfield(1);
//		mb11.setLongfield(888888888888888L);
//		String bcd = new String("tqqqaas");
//		mb11.setStringfield(bcd);
		//System.out.println("bcd=" + SizeOfAgent.sizeOf(bcd));

//		MemoryBean mb1 = new MemoryBean();
//		mb1.setIntfield(1);
//		mb1.setLongfield(888888888888888L);
//		mb1.setStringfield("This is a test,This is a test,This is a test,This is a test,This is a test,This is a test,This is a test,This is a test,This is a test");
//		mb1.setMemoryBean1(mb11);
//		String abc = new String("s");
		//System.out.println("abc = " + SizeOfAgent.fullSizeOf(abc));
//		mb1.setAbc(abc);
//		System.out.println("mb1 size = " + SizeOfAgent.sizeOf(mb1));
//		System.out.println("mb1 size = " + SizeOfAgent.fullSizeOf(mb1));
		
		Pojo pojo = new Pojo();
		long size = SizeOfAgent.sizeOf(pojo);
		System.out.println("size = " + size);
//		
//		Thread thread = new Thread();
//		long threadSize = SizeOfAgent.sizeOf(thread);
//		System.out.println("threadSize = " + threadSize);
//		long fullThreadSize = SizeOfAgent.fullSizeOf(thread);
//		System.out.println("fullThreadSize = " + fullThreadSize);
//		long dateSize = SizeOfAgent.sizeOf(new Date());
//		System.out.println("dateSize = " + dateSize);
	}
}
