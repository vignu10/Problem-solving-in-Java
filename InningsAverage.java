// The runs scored by a cricket team in the first and second innings of N test cricket matches are passed as input. The program must print the average of first and second innings (with precision upto two decimal places).

// Input Format:
// The first line denotes the value of N.
// Next N lines will contain the first and second innings score separated by a space.

// Output Format:
// The first line contains the average of first innings score.
// The second line contains the average of second innings score.

// Boundary Conditions:
// 2 <= N <= 20
// The value of the runs will be from 0 to 1000.

// Example Input/Output 1:
// Input:
// 3
// 250 200
// 450 300
// 200 250

// Output:
// 300.00
// 250.00

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int firstInnings[]=new int[n];
	    int secondInnings[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        firstInnings[i]=sc.nextInt();
	        secondInnings[i]=sc.nextInt();
	    }
	    float avg1=0;
	    float avg2=0;
	   for(int i=0;i<n;i++){
	           avg1+=firstInnings[i];
	           avg2+=secondInnings[i];
	   }
	   System.out.printf("%.2f\n%.2f",avg1/n,avg2/n);

	}
}
