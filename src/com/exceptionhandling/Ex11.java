package com.exceptionhandling;
// Possible Combination of Try - Catch - Finally

public class Ex11 {
	public static void main(String[] args) {

//		1] - try catch with parent Exception class
		try {

		} catch (Exception e) {

		}

//		2] - child Exception class 1st then 2nd parent Exception class we can use
		try {

		} catch (ArithmeticException A) {

		} catch (Exception e) {

		}

//		3] - if we write parent Exception class 1st - Next Exception class we can't write
//		try {
//
//		} catch (Exception e) { // 
//
//		}catch (ArithmeticException a){ // error
//		
//		}

//		4] - cannot use same exception name twice
//		try {
//
//		} catch (ArithmeticException A) {
//
//		} catch(ArithmeticException a) { // Error
//			
//		}

//		5] - we can use two different exception 
		try {

		} catch (ArithmeticException e) {

		} catch (NullPointerException n) {

		}

//		6] - we can use try-catch inside try
		try {
			try {
				try {

				} catch (Exception e) {

				}

			} catch (Exception e) {

			}
		} catch (Exception e) {

		}

//		7] - we can use try-catch inside catch
		try {
			
		}catch(Exception e) {
			try {
				
			}catch(Exception e1) {
				
			}
		}
		
//		8] - we can use try-catch-finally
		try{
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
//		9] - we can use try-finally
		try {
			
		}finally {
			
		}
		
//		10] - we can use try-catch inside finally
		try {
			
		}finally {
			try {
				
			}catch(Exception e){
				
			}
		}
		
		
		
		
		
		
	}

}
