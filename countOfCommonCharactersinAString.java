import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char s1[]=sc.next().toCharArray();
		char s2[]=sc.next().toCharArray();
		int res=0;
		for(int i=0;i<s1.length;i++)
		{
    int count=0;
		    for(int j=0;j<s2.length;j++)
		    {
		        if(s1[i]==s2[j])
		        {
		            s2[j]='A';
		            count++;
		        }
		    }
		    if(count>0)
		    {
		        res++;
		    }
		}
		System.out.print(res);
	       

	}
}
