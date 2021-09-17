import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	int l = inr.nextInt();
        int ul=0;
	int ll=0;
		
	if (l%2!=0){
	   ul=(l/2)+1;			
	   ll=l-ul;
	
	for(int i=1;i<=ul; i++){	
	
	for(int s=1;s<=(ul-i); s++){
	    System.out.print(" ");
	}
	
	for(int j=1;j<=i; j++){
	     System.out.print("* ");
	}
	System.out.println();
	}
			
	
	int llc=ll;
	for(int i=1;i<=ll; i++){
	
	for(int s=llc;s<ll; s++){
	   System.out.print(" ");
	}
	
	for(int j=1;j-1<=ll-i; j++){
	   System.out.print(" *");
	 }
	 llc--;
	System.out.println();
        }
	}
        else{
	   System.out.print("Invalid line number");
	}

    }
}
