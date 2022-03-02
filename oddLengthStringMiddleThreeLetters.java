
// An odd length string S is passed as the input. The middle three letters of S must be printed as the output.

// Input Format:
// First line will contain the string value S

// Output Format:
// First line will contain the middle three letters of S.

// Boundary Conditions:
// Length of S is from 5 to 100

// Example Input/Output 1:
// Input:
// level

// Output:
// eve

// Example Input/Output 2:
// Input:
// manager

// Output:
// nag

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int middle=s.length()/2;
		System.out.printf(s.charAt(middle-1),s.charAt(middle),s.charAt(middle+1));
		

	}
}
