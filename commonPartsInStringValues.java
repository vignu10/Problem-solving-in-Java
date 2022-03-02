
// Two string values S1 and S2 are passed as input. The last portion of S1 will be the first portion of S2. The program must print this common part in S1 and S2.

// Input Format:
// The first line contains S1.
// The second line contains S2.

// Output Format:
// The first line contains the common part.

// Boundary Conditions:
// Length of S1 and S2 will be from 3 to 100.

// Example Input/Output 1:
// Input:
// mayday
// daybreak

// Output:
// day

// Example Input/Output 2:
// Input:
// bridge
// gear

// Output:
// ge


import java.util.*;
public class Hello {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
   String s=sc.next();
   String s1=sc.next();
   String s2="";
   for(int i=0;i<s.length();i++)
    {
    s2=s.substring(i,s.length());
    if(s1.startsWith(s2))
    System.out.print(s2);
    }
}

}
