import java.util.*;

public class Main {
  
  static boolean checkPrime(int n)
  {
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    return true;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
          if(checkPrime(arr[i]))
          {
            list.add(arr[i]);
          }
        }
        for(int l : list)
        {
          System.out.println(l);
        }
        
    }
}
