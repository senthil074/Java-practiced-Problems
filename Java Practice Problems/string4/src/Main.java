import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        int c=0;
        int d=5;
        for (int i = 0;i<l/5;i++){
            String b = a.substring(c,d);
            c+=5;
            d+=5;
            System.out.println(b);
        }
    }
}

// print the numbwers in 5 letters in a line