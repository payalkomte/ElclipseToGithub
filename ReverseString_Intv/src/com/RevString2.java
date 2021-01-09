package com;

public class RevString2 {

	public static void main(String[] args) {
		String s = "India in live I";
		String[] split = s.split(" ");
		String result = "";
		
		for (int i = split.length-1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());

	}

}
