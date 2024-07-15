import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String s = sc.nextLine();
        int l = a.length();
        int m = s.length();

        for (int i=0;i<l;i++){
            char c = a.charAt(i);
            boolean result = true;
            for (int j=0;j<m;j++ ){
                char d = s.charAt(j);
                if(c==d){
                    result = false;
                }


            }
            if (result==true){
            System.out.print(c);
        }


    }
}}
