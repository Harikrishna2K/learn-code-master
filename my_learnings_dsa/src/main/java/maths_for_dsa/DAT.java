package maths_for_dsa;

import java.util.Scanner;

/**
 * Direct Address Table
 * -> 
 * 
 * **/

public class DAT {
	
	
	static void getTheString(int size, String word) {
		int arr[] = new int[26];
		for(int i = 0; i<size;i++) {
			arr[word.charAt(i)- 'A']++;
		}
		
		for(int i = 0; i<26;i++) {
			char ch = (char)('A' + i);
			
			System.out.println(ch + "->" + arr[i]);
		}
	} 	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int size = word.length();
		
		getTheString(size,word);
		
	}
	

}
