/**
 * ! String Class : (1)String -> String class creates immutable object(Immutable mean that can not be changed).
 * *                (2)StringBuffer -> StringBuffer class creates mutable object(Mutable mean that can be changed).
 * * This is two main difference between String and StringBuffer class.
 * * charAt() -> get the character from the string.
 * * setCharAt() -> modify or setting the new character in string.
 * * delete() -> delete the character from a given string.
 * * deleteCharAt() -> delete the character from specific posiiton in a given string.
 * * append() -> Add the character or concatenation from the last posiiton in a given string.
 * * insert() -> add the string or character from specific position in a given string .
 * 
 * */
 import java.util.*;
 class StringVsStringBuffer{
 	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 		System.out.println("------------------String Class-----------------------");
 		String myString = new String("Java");
 		System.out.println("The string is = "+myString);
 		System.out.println("The length of the string = "+myString.length());
 		myString.concat("Programming");
 		System.out.println("-----------------------------------------");
 		System.out.println("The new string is = "+myString);
 		System.out.println("The length os the new string is = "+myString.length());
 		System.out.println("-----------------StringBuffer Class------------------------");
 		StringBuffer myStringBuffer = new StringBuffer("Java");
 		System.out.println("The string is = "+myStringBuffer);
 		System.out.println("The length os the string is = "+myStringBuffer.length());
 		System.out.println("The capacity of the string is  = "+myStringBuffer.capacity());
 		System.out.println("-----------------------------------------");
 		myStringBuffer.append("Programming");
 		System.out.println("The new string is = "+myStringBuffer);
 		System.out.println("The new length of the new string = "+myStringBuffer.length());
 		System.out.println("The new capacity of the new string is = "+myStringBuffer.capacity());
 		System.out.println("-----------------charAt() and setCharAt()------------------------");
        System.out.print("Enter the string : ");
        String name = scanner.nextLine();
        StringBuffer sb = new StringBuffer(name);
        System.out.println("The string is = "+sb);
        System.out.println("The String length is = "+sb.length());
        char ch = sb.charAt(3);
        System.out.println("The charcter at 3rd position in string is = "+ch);
        sb.setCharAt(0,'P');
        System.out.println("The modified string is = "+sb);
        System.out.println("The length of new string is  = "+sb.length());
        System.out.println("------------delete(),deleteCharAt(),append(),insert()-----------------------------");
        System.out.print("Enter the new string : ");
        String myNewString = scanner.nextLine();
        StringBuffer sbf = new StringBuffer(myNewString);
        System.out.println("The new string is = "+sbf);
        System.out.println("The new string length is = "+sbf.length());
        sbf.delete(3,7);
        System.out.print("After deleting from given position th new string is = "+sbf+"\t And length is = "+sbf.length());
        System.out.println();
        sbf.deleteCharAt(1);
        System.out.println("After deleting from given position th new string is = "+sbf+"\t And length is = "+sbf.length());
        sbf.append("pool");
        System.out.println("Inserting at last from given position th new string is = "+sbf+"\t And length is = "+sbf.length());
        sbf.insert(10," is a beautiful name");
        System.out.println("Inserting new string from given position the new string is = "+sbf+"\t And length is = "+sbf.length());
        System.out.println("---------------------------------------------------------------");





 	}
 } 