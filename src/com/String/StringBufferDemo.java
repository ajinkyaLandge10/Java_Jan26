package com.String;

//  StringBuffer

public class StringBufferDemo {

	public static void main(String[] args) {

// StringBuffer Constructors	
		
//		1]- default constructor
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16 Initial capacity
		
//		2]-String Constructor
		StringBuffer sb1 = new StringBuffer("Ajinkya");
		System.out.println(sb1.capacity()); //23 = IC + StringLength
		
//		3]-int capacity Constructor
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println(sb2.capacity()); // 50
		
		System.out.println("---------------------------------------");
		
// StringBuffer Methods
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity()); //16
		s.append("Hello");
		System.out.println(s.capacity()); //16
		s.append("Ajinkya welc");
		System.out.println(s.capacity()); //34 = (IC*2)+2 or (IC+1)*2
		
		
		System.out.println(s.length()); //17
		System.out.println(s.append("ome")); //HelloAjinkya welcome
		System.out.println(s.charAt(7)); //i
		System.out.println(s.delete(18, 20));
		
		
		

	}

}
