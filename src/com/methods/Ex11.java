package com.methods;

public class Ex11 {

	public static void main(String[] args) {

	}

	public int add(int a, int b) {
		return a + b;
	}

	public long test2() {
		long a = 10;
		return a;
	}

	public byte test3(byte a, byte b) {
		return (byte) (a + b);
	}

	public short test4(short a, long b) {
		return (short) (a + b);
	}

	public double test5(short a, long b) {
		return (a + b);
	}

	public short test6(short a, long b) {
		return (short) (double) (a + b);
	}

}
