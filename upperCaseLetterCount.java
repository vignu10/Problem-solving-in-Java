import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		int count=0;
	   Scanner sc=new Scanner(System.in);
	   String str=sc.nextLine();
	   char[] ch=new char[str.length()];
	   for(int i=0;i<str.length();i++)
	   {
	       ch[i]=str.charAt(i);
	   }
	   for(char chh:ch)
	   {
	       if(chh>='A'&&chh<='Z')
	       {
	           count++;
	       }
	       continue;
	   }
	   System.out.print(count);

	}
}
