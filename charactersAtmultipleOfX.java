// A string S is passed as the input. A positive integer X is also passed as the input. The program must print the characters at positions which are multiples of X.

// Input Format:
// The first line contains S.
// The second line contains X.

// Output Format:
// The first line contains the characters at positions which are multiples of X.

// Boundary Conditions:
// Length of S will be from 3 to 100.

// Example Input/Output 1:
// Input:
// abcdexyzwqpoolj
// 5

// Output:
// eqj

// Explanation:
// The multiples of 5 are like 5, 10, 15,...
// So the characters in these positions are e,q,j


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int x=sc.nextInt();
		for(int i=x-1;i<str.length();i=i+x)
		{
		        System.out.print(str.charAt(i));
		}
		

	}
}
