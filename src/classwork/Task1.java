package classwork;

public class Task1 {
    public static int myMax(int x, int y) {    	
    	if(x>y) return x;
    	else return y;
    //	return x>y?x:y;
    }
    public static void task1Variant1(int a , int b ,int c ,int d) {    	
    	int myMax = 0;
		if (a >= b && a >= c && a >= d) {
			myMax = a;
			System.out.println("a bigger");
		}
		if (b>=a&&b>=c&&b>=d){
			myMax = b;
			System.out.println("b bigger");
		}
		if (c>=a&&c>=b&&c>=d){
			myMax = c;
			System.out.println("c bigger");
		}
		if (d>=a&&d>=b&&d>=c){
			myMax = d;
			System.out.println("d bigger");
		}
		System.out.println("max value = "+ myMax);
    }
    public static int task1FindMax(int a , int b ,int c ,int d) {
    	int myMax=a;
		if(myMax<b) {myMax=b;}
		if(myMax<c)myMax=c;
		if(myMax<d)myMax=d;
		//System.out.println("max value = "+ myMax);
		return myMax;
    }
    public static int task2FindMaxCount(int a , int b ,int c ,int d) {    	
    	int myMax = task1FindMax(a, b, c, d);
		int maxCount=0;
		if(myMax==a) maxCount++;
		if(myMax==b) maxCount++;
		if(myMax==c) maxCount++; // maxCount=maxCount+1;
		if(myMax==d) maxCount++;
		return maxCount;
    }
    public static void taskInc() {
    	int y=0, x=0;
		System.out.println(y++); 
		System.out.println(y);
		System.out.println(++x);
		System.out.println(x);
    }
    public static int task1FindMaxCalcByMath(int a , int b ,int c ,int d) {
    	return Math.max(Math.max(Math.max(a,b),c),d);
    }
    public static int task1FindMaxCalcByMyMax(int a , int b ,int c ,int d) {
    	return myMax(myMax(myMax(a,b),c),d);
    }
    public static String seasonByMonth(int n) {
    	String season="";
    	switch(n) {
    	case 1: 
    	case 2: season= "Winter";break;
    	case 3:
    	case 4:
    	case 5: return "Spring";
    	
    	default: return "Error";
    	}  
    	return season;
    }
    public static void print(int res) {
    	System.out.println("-------------");
    	System.out.println("value = "+res);
    	System.out.println("-------------");
    }
    public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 3;
	//	task1Variant1(c,1,1,91);		
		System.out.println("max value count = "+ task2FindMaxCount(a, b, c, d));
		print(a);
		System.out.println(seasonByMonth(3));
	}
    	
    
}
