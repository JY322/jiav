package com.accp.test;


public class test {

	public static int str = 0;
	public int str1 = 0;
	
	public test() {
		str++;
		str1++;
		System.out.println(str+"====="+str1);
	}



	public static void main(String[] args) {
		int a=2; /*底数*/
		int b=4; /*乘方*/
		double f=Math.pow(a,b); /*a和b套用到此行的程式(a的b次方等於f)*/
		System.out.println("2的3次方等於"+f);
	}

}
