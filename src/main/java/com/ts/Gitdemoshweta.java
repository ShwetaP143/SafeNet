package com.ts;

import java.util.Scanner;

public class Gitdemoshweta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int originalnum = sc.nextInt();
		int tempnum = originalnum;
		int rev = 0;
		while (originalnum > 0) {
			rev = rev * 10 + (originalnum % 10);
			originalnum = originalnum / 10;
		}
		if (tempnum == rev) {
			System.out.println("Palindrom");
		} else
			System.out.println("Not palindrom");
	}
}
