package com;

public class RevString {

	static StringBuffer s=new StringBuffer("Payal is name My");
	
	public static void main(String[] args) {
		System.out.println(s+"\n");
		int i=0;//start index of string s
		int j=0;//last index of particular word
		int w=0;//start index of particular word

		while(i<s.length()) {
			if(i==0)
				w=0;
			if(s.charAt(i)==' ' || i==s.length()-1) {
				//j=i;
				if(i==s.length()-1)
					j=i;
				else
					j--;
				swap(w,j);
				w=i+1;
			}
			i++;
		}
		StringBuffer st=swap(0,s.length()-1);
		System.out.println(st);
	}

	static StringBuffer swap(int i,int j) {
		while(i<j) {
			char ch=s.charAt(i);
			s.setCharAt(1,s.charAt(j));
			s.setCharAt(j, ch);
			i++;
			j--;
		}
		return s;
	}
}
