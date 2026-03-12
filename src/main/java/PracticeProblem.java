/**
		* File: Lesson 2.1 - Methods and Parameters
		* Author: Tom Leung
		* Date Created: March 11, 2026
		* Date Last Modified: March 11, 2026
		*/



public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static int sum (int num1, int num2){
		int num3;
		num3 = num1 + num2;
		return num3;
	}

	public static int difference(int num1, int num2){
		int num3;
		num3 = num1-num2;
		return num3;
	}

	public static double product(double num1, double num2){
		double num3;
		num3 = num1*num2;
		return num3;
	}

	public static String removeFirst(String v1){
		String v2;
		char v3;
		int index;
		v2=v1.trim();
		v3=v2.charAt(0);
		index=v1.indexOf(v3);
		v1=v1.substring(0,index) + v1.substring(index+1);
		return v1;


	}
	//Create your functions here

}
