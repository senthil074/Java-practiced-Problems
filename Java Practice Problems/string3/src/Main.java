import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = a.length();
        for (int i =0;i<b;i++){
            boolean result = true;
            char c =a.charAt(i);
            for (int j = 0;j<b;j++){
                char d =a.charAt(j);
                if (c==d && i!=j){
                    result = false;
                    break;
                }
            }
            if (result==true){
                System.out.print(a.charAt(i));


            }
        }

    }
}