// String S is passed as the input to the program. S may or may not have a single underscore embedded in it. The program must reverse the String S till the first underscore and print it as the output.

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the string S modified based on the given conditions.

// Boundary Conditions:
// Length of S is from 3 to 100.

// Example Input/Output 1:
// Input:
// abcd_pqrs

// Output:
// dcba_pqrs

// Example Input/Output 2:
// Input:
// _kilo

// Output:
// _kilo

// Example Input/Output 3:
// Input:
// nounderscore

// Output:
// erocsrednuon
 

import java.util.Scanner;

public class Hello{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int u=str.indexOf("_");
    if(u==-1)
      System.out.print(new StringBuffer(str).reverse().toString())
    else if(u==0)
      System.out.print(str);
    else
    {
     if(u==str.length()-1)
     {
       String s[]=str.split("_");
       System.out.print(new StringBuilder(s[0]).reverse().toString()+"_");
     }
     else 
     {
      String s[]=str.split("_");
       System.out.print(new StringBuilder(s[0]).reverse().toString()+"_"+s[1]);
     }
      
      
    }
    
    
    
    
  }
}
    
    
    
    
    
    
