package com.string;

import java.util.Scanner;

public class ReverceStringAndPalindrome {

	public String getReverceString(String name) {
		
		String reverce=" ";
		for(int i=name.length()-1;i>=0;i--) {
			reverce=reverce+name.charAt(i);
		}
		System.out.println("This is Reverce String>>> "+reverce);
		return reverce;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter the string name>>>");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		
		ReverceStringAndPalindrome reverceStringAndPalindrome=new ReverceStringAndPalindrome();
		String reverce=reverceStringAndPalindrome.getReverceString(name);
		
		if(reverce.equalsIgnoreCase(name)) {
			System.out.println("This is Palindrome String");
		}else {
			System.out.println("This is Not Palindrome String");
		}
	}
}
