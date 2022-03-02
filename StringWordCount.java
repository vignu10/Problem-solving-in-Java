// The program must accept a string S and print the count of words in S.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the integer value representing the word count.

// Example Input/Output 1:
// Input:
// I like tea

// Output:
// 3

// Example Input/Output 2:
// Input:
// I like coffee very much

// Output:
// 5


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here\
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String count[]=str.split(" ");
		System.out.print(count.length);

	}
}
