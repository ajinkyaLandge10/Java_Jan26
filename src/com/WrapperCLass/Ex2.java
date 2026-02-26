package com.WrapperCLass;

public class Ex2 {

	public static void main(String[] args) {
		
		Integer i1 = 10;
		Integer i2 = 20;
		
		System.out.println(i1.compareTo(i2));
		System.out.println(Integer.max(i1, i2));
		System.out.println(Integer.min(i1, i2));
		System.out.println(Integer.sum(i1, i2));
		
		System.out.println("\n\n\n\n");
		
		System.out.println(Byte.MAX_VALUE +" <==> "+Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE +" <==> "+Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE +" <==> "+Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE +" <==> "+Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE +" <==> "+Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE +" <==> "+Float.MIN_VALUE);
		

	}

}
