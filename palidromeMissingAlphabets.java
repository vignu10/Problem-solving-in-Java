
// String S which is a palindrome is passed as the input. But just one alphabet A is missing in S. The program must print the missing alphabet A.
// Note: The FIRST alphabet of S will always be present.

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the missing alphabet A.

// Boundary Conditions:
// The length of the input string S is between 3 to 100.
// The FIRST alphabet of S will always be present.

// Example Input/Output 1:
// Input:
// malayaam

// Output:
// l

// Example Input/Output 2:
// Input:
// abcddcb

// Output:
// a


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	   int count=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
		{
		    {
		        if(arr[i]!=arr[j])
		        {
		            if(arr[i]==arr[j-1]&(i!=j-1))
		            {
		            System.out.print(arr[j]);
		            break;
		            }
		            else{
		                System.out.print(arr[i]);
		                break;
		            }
		        }
		        
		    }
		}
    
	}
}
