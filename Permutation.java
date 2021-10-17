package com.duke;

public class Permutation {
	
	public static void permute(String str) {
		int l = str.length();
		permute(str,0,l);
	}

	// i -> fixed each time
	private static void permute(String str, int i, int l) {
		if(i==l)
		{
			System.out.println(str);
			return;
		}
		
		for (int j = i; j < l; j++) {
			//i is fixed and swap with j all time;
			str = swap(str,i,j);
			permute(str,i+1,l);
			//do the same swap to return the original string
			str = swap(str,i,j);
		}
		
	}

	private static String swap(String str, int i, int j) {
		char[] ch = str.toCharArray();
		char temp = ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		String string = "abc";
		permute(string);
	}

}
