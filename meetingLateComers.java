A certain number of people attended a meeting which was to begin at 10:00 am on a given day. The arrival time in HH:MM format of those who attended the meeting is passed as the input in a single line, with each arrival time by a space. The program must print the count of people who came late (after 10:00 am) to the meeting.

Input Format:
The first line contains the arrival time separated by a space.

Output Format:
The first line contains the count of late comers.

Boundary Conditions:
The length of the input string is between 4 to 10000.
The time HH:MM will be in 24 hour format (HH is hours and MM is minutes).

Example Input/Output 1:
Input:
10:00 9:55 10:02 9:45 11:00

Output:
2

Explanation:
The 2 people were those who came at 10:02 and 11:00

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int count=0;
	    String s1[]=s.split(" ");
	    for(String x:s1)
	    {
	        String s2[]=x.split(":");
	        int h=Integer.parseInt(s2[0]);
	        int m=Integer.parseInt(s2[1]);
	        if(h==10&&m>0)
	        {
	            count++;
	        }
	        else if(h>10)
	        {
	            count++;
	        }
	    }
	    System.out.print(count);
	}
}
