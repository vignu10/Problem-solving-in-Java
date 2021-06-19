import java.util.Scanner;
public class integer_qdiff
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int i,count;
    int p=sc.nextInt();
    int q=sc.nextInt();
    int arr[]=new int[p];
    for(count=0;count<arr.length;count++)
    {
        arr[count]=sc.nextInt();
        
    }
    int counter=0;
    int n=arr.length;
    for(i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
         if(Math.abs(arr[i]-arr[j])==q)
         {
            
             counter++;
        }
        
    }
   }
   System.out.println(counter);
}
}