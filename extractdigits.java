import java.util.Scanner;
class extractdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        n=n/100;
        n=n-n/10*10;
        System.out.print(n);    
    }
}