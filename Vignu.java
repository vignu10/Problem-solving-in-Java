import java.util.Scanner;
public class Vignu
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ble value");
        int ble=sc.nextInt();
        System.out.println("Enter the var value");
        int var=sc.nextInt();
        if(ble==var)
        {
           for(int i=0;i<5;i++)
           {
               System.out.print(i);
            }
        }
        else
        {
          while(var!=0)
          {
              var--;
            }
            System.out.print(var);
        }
    }
        
}