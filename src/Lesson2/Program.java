package Lesson2;

public class Program {

	public static void main(String[] args) {
		// TODO finish program

		int x = 2;
		int y = 3;
		int res = x + 1;
		System.out.println(res);
		
		String str1="vas";
		String str2="vas";
		System.out.println(str1==str1);
		System.out.println(str1.equals(str2));
		String str11=new String("vas");
		String str22=new String("vas");
		System.out.println(str11==str22);
		System.out.println(str11.equals(str22));
		
		char ch = '9'; 
		int i1 = Character.getNumericValue(ch);    
		System.out.println(i1); 
		System.out.println(1+i1);
		
		
		


	}

}
