// A single line consisting of a set of integers, each separated by space is passed as input to the program. The program must print the sum of all the integers present.

// Input Format:
// The first line contains the integer values (Each separated by a space)

// Output Format:
// The first line contains the sum of all the integers.

// Boundary Conditions:
// The length of the input string is between 3 to 10000
// The value of the integer values will be from -99999 to 99999

// Example Input/Output 1:
// Input:
// 100 -99 98 5

// Output:
// 104

// Example Input/Output 2:
// Input:
// 100 200 -300 500 -450 -50

// Output:
// 0

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String[] s=n.split("[ ]");
		int k=0;
		for(String i:s)
		{
		    k+=Integer.parseInt(i);
		}
		System.out.print(k);

	}
}
