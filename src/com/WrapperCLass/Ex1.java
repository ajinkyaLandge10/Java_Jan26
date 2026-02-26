package com.WrapperCLass;

public class Ex1 {

	public static void main(String[] args) {
		
		int a =10;
		
//		Primitive To Non-Primitive
//		Integer aa = new Integer(10);  - Deprecated 
		Integer A1 = Integer.valueOf(a); // Manual-Boxing
		Integer A2 =a;  // AutoBoxing
		
//		Non-Primitive To Primitive
		int a1=A1.intValue();  //Manual-Unboxing
		int a2=A2;	//AutoUnBoxing
		
		
		String Num = "10";
		
		Integer Number1 = Integer.valueOf(Num);
		String str = Number1.toString();
		
		System.out.println("\n\n\n");
		
//		String to All Primitive 
		String str1 = "127";
		byte b = Byte.parseByte(str1);
		System.out.println(b);
		
		short s = Short.parseShort(str1);
		System.out.println(s);
		
		int i = Integer.parseInt(str1);
		System.out.println(i);
		
		long l = Long.parseLong(str1);
		System.out.println(l);
		
		float f = Float.parseFloat(str1);
		System.out.println(f);
		
		double d = Double.parseDouble(str1);
		System.out.println(d);
		
		String str2 = "true";
		boolean bl = Boolean.parseBoolean(str2);
		System.out.println(bl);
		System.out.println(str2.charAt(2));
		
		
		

	}

}
