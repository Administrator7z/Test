package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;



public class Demo03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����");
		int num = sc.nextInt();
		if(num % 4 == 0 && num % 100 != 0) {
			System.out.println(num + "��");
		}
		else {
			if(num % 400 == 0) { 
				System.out.println(num + "��");
			}
			else {
				System.out.println(num +"����");
			}
			
		}
	}
}