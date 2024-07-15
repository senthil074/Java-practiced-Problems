import java.util.*;
import java.math.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        BigInteger b=BigInteger.ONE;
        for(int i=1;i<=a;i++){
            b=b.multiply(BigInteger.valueOf(i));
            //100System.out.println(b+"       "+i);
        }
        System.out.println(b);
        String a=


    }
}