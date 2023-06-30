package com.poseidon.jini;

import java.util.Scanner;

public class JiniMaker {
	public static void main(String[] args) {
	
		JINI jini = new JINI();
		Scanner sc = new Scanner(System.in);
		
		while (jini.isQute) {
			System.out.println("단어 입력 : ");
			String input = sc.next();
			jini.scheck(input);
		}
	}
	
	
}
