import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	
		String str= "Vinay", nstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Vinay");
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); 
		nstr= ch+nstr; 
	}
	System.out.println("Reversed word: "+ nstr);
	}
}
