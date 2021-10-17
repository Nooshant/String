package com.duke;

public class Combination {

	public static void combination(String str) {

		combination("", str);
	}

	/**
	 * @param prefix
	 * @param str
	 */
	//way-1 to find combination
	private static void combination(String prefix, String str) {

		if (str.length() > 0) {
			System.out.println(prefix + str.charAt(0));
			combination(prefix + str.charAt(0), str.substring(1));
			combination(prefix, str.substring(1));
		}
	}
	
	//2-way to find combination
	public static void combinationOfString2(String str, int len)
	{
		//store all the combination of string
		String[] arr = new String[len];
		int total = combinationOfString2(str,arr);
		
		for (int j = 0; j < total; j++) {
			System.out.println(arr[j]);
		}
		
	}

	private static int combinationOfString2(String str, String[] arr) {
		if(str.length()==0)
		{
			arr[0]="";
			return 1;
		}
		int smaller = combinationOfString2(str.substring(1),arr);
		
		for (int i = 0; i < smaller; i++) {
			arr[i+smaller]=str.charAt(0)+arr[i];
		}
		return 2*smaller;
	}

	public static void main(String[] args) {
		//combination("abc");
		String str ="abc";
		int len = (int) Math.pow(2,str.length());
		System.out.println(len);
		combinationOfString2(str,len);
	}

}
