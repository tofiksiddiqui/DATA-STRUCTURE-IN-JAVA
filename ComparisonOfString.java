/**
 * ! Comparison of String : Three methods are used 
 * * (1).Using compareTo()
 * * (2).Using equals()
 * * (3).Using equalsIgnoreCase()
 * */

 class ComparisonOfString{
 	public static void main(String[] args) {
 		System.out.println("-------------------------------------------------------");
 		String str1 = "this is java programming";
 		String str2 = "This is java programming";
 		int d = str1.compareTo(str2);
 		System.out.println("The difference between first string and second string is = "+d);
 		boolean bool = str1.equals(str2);
 		System.out.println("-------------------------------------------------------");
 		System.out.println("This is = "+bool);
 		System.out.println("-------------------------------------------------------");
        boolean bool1 = str1.equalsIgnoreCase(str2);
        System.out.println("This is = "+bool1);
        System.out.println("-------------------------------------------------------");

 	}
 }