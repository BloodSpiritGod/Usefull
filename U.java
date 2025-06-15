package usefull;

import java.awt.Color;

public  class U {
	
	
	/**
	 * prints a String to the Terminal
	 * @param The String to be printed
	 */
	
	
	public static void print(String a) {
		
		
		System.out.println(a);
		
	}
	
	/**
	 * prints an int to the Terminal
	 * @param The Integer to be printed
	 */
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	/**
	 * prints a boolean to the Terminal
	 * @param The boolean to be printed
	 */
	
	public static void print(boolean a) {
		System.out.println(a);
	}
	
	/**
	 * prints a double to the Terminal
	 * @param The double to be printed
	 */
	
	public static void print(double a) {
		System.out.println(a);
	}
	
	/**
	 * prints a float to the Terminal
	 * @param The float to be printed
	 */
	
	public static void print(float a) {
		System.out.println(a);
	}
	
	/**
	 * prints a long to the Terminal
	 * @param The long to be printed
	 */
	
	public static void print(long a) {
		System.out.println(a);
	}
	
	/**
	 * prints a char to the Terminal
	 * @param The char to be printed
	 */	
	
	public static void print(char a) {
		System.out.println(a);
	}
	
	/**
	 * tests if a String is a Number
	 * @param n
	 * @return true || false
	 */
	
	public static boolean isNumber (String n) {
		
		
		try {
			
			int s = Integer.parseInt(n);
		}
		catch (NumberFormatException e) {
			return false;
		}
		
		
		return true;
	}
	
	/**
	 * 	Returns a Char Object from the String Object at the specific index
	 * @param The String source for the char output
	 * @param The index of the char inside the String object
	 * @return The char at the index of the String object
	 */
	
	public static char cHar (String g, int index) {
		
		return g.charAt(index);
	}
	
    /**
     * Returns a random Integer
     * @param minimum Integer value
     * @param maximum Integer value
     * @return randomized Integer between the minimum and the maximum value
     */
	
	public static int randomInt (int min, int max) {
		int result = 0;
		int range = max - min + 1 ;
		
		result = (int) (Math.random() * range) + min;
		
		
		return result;
	}
	
	
	public static String replaceChar (char t, String word, int index) {
		String result = "";
	    
		char[] platz = word.toCharArray();
		
		platz[index] = t;
		for (int i = 0; i < platz.length; i++) {
			result += platz[i];
		}
		
		
		
		
		return result;
	}
	
	public static String removeChar (String word, int a, int b) {
		String result = "";
		char[] platz = word.toCharArray();
		
		for (int i = a; i < b+1; i++) {
			
		}
		
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
