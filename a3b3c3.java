import java.util.Scanner;
public class a3b3c3 {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            String s=sc.next();
            sc.close();
            String[] st=s.split("[a-z]+");
            String[] str=s.split("[0-9]+");

            int size=st.length-1;
            int[] num=new int[size];
            String[] arr=new String[size];

            int j=0;

            for(String i:st){
                System.out.println(i);
                if(!i.equals("")){
                    num[j]=Integer.parseInt(i);
                    j++;
                }
            }

            j=0;

            for(String i:str){
                if(!i.equals("")){
                    arr[j]=i;
                    j++;
                }
            }

            for(int i=0;i<size;i++){
                System.out.print(arr[i].repeat(num[i]));
            }

        }
}