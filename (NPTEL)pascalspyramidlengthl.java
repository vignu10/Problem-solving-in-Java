import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int l = inr.nextInt();
        // Add the necessary code in the below space
int i,j;
        int space=l-1;
     for(i=0;i< l;i++)
       {
	    for(j=0;j< space;j++)
	    {
		    System.out.print(" ");
	    }
	    for(j=0;j<=i;j++)
	    {
		    System.out.print("* ");
	    }
		
	    System.out.print("\n");
	    space--;
         }
   	}
}
