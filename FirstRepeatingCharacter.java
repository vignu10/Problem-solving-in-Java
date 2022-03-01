// A string S is passed as the input. S has at least one repeating character. The program must print the first repeating character C.

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains C.

// Boundary Conditions:
// Length of S will be from 3 to 100.

// Example Input/Output 1:
// Input:
// abcdexyzbwqpoolj

// Output:
// b


import java.util.*;

public Class Main(){
  
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    String str=sc.nextInt();
    for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        if(str.charAt[i]==str.charAt[j]){
          System.out.print(str.charAt[i]);
          return;
        }
      }
    }
    
    
    
  }
}
