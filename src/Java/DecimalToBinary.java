package Java;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        String x="";
        while(n>0)
        {
            int a=n%2;
            x=x+a;
            n=n/2;

        }
        System.out.println(x);
    }
}
