package homework;

public class Taskif {

	public static int if1 (int x) {
		if (x>=0) return x+1;	
		else return x;			
		}
	public static int if2 (int x) {
		if (x>=0) return x+1;	
		else return x-2;	
	}
	public static int if3 (int x) {
		if (x>0) return x+1;
		if (x<0) return x-2;
		else return 10;
	}
	/**
	 * Show positive and negative count of numbers a,b,c
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int[] positiveNegativeCount (int a, int b, int c) {
		int positiveCount=0;
		int negativeCount=0;
		if(a>=0) positiveCount++;else negativeCount++;
		if(b>=0) positiveCount++;else negativeCount++;
		if(c>=0) positiveCount++;else negativeCount++;
		return new int[] {positiveCount, negativeCount};
		
	}
	//-------------------------------------------------------------------
	public static int if15 (int a, int b, int c) {
		int if15 = Math.max((Math.max((a+b),(b+c))),(a+c));
		return if15;
	}
	public static String numberDescribtion(int a) {
		String str0 = "wrong number!";
		String str1 = "even 1-digit";
		String str2 = "odd 1-digit";
		String str3 = "even 2-digit";
		String str4 = "odd 2-digit";
		String str5 = "even 3-digit";
		String str6 = "odd 3-digit";
		if(a<0) return str0;
		if(a<10 && a%2==0) return str1;
		if(a<10 && a%2!=0) return str2;
		if(a<100 && a%2==0) return str3;
		if(a<100 && a%2!=0) return str4;
		if(a<1000 && a%2==0) return str5;
		if(a<1000 && a%2!=0) return str6;
		else return str0;
		
	}
	public static void main(String[] args) {
		
		int a = 789, b = -3, c =6;
		int result[] = positiveNegativeCount(a,b,c);
		  System.out.println(result[0]+"and"+result[1]);
		  //-------------------------------
		  System.out.println(if15(a,b,c));
		System.out.println(numberDescribtion(a));
	
	}
}
