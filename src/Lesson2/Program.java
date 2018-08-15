package Lesson2;

public class Program {

	public static void main(String[] args) {
		// TODO finish program
		int a,b,c; // declares three ints a b c
		
		int x = 2; // declares x int and initializing it
		int y = 3;
		int res = x + 1; // dynamically initialized
		System.out.println(res);
		
		String str1="vas";
		String str2="vas";
		System.out.println(str1==str1);
		System.out.println(str1.equals(str2));
		String str11=new String("vas");
		String str22=new String("vas");
		System.out.println(str11==str22);
		System.out.println(str11.equals(str22));
		
		char ch = '9'; // variable ch has the value '9'
		int i1 = Character.getNumericValue(ch);    
		System.out.println(i1); 
		System.out.println(1+i1);
		
		int oct = 056;
		System.out.println("octal = "+oct);
		int hex = 0xAB;
		System.out.println("hexadecimal = "+hex);
		
		int undrscrs = 435_244__123;
		System.out.println(undrscrs); //underscores will be ignored
		
		
		


	}

}
