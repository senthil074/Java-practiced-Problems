// find the last 2 digits same or not
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c=a.length();
        int d = b.length();
        if (a.substring((c-3),(c-1)).equals (b.substring((d-3),(d-1)))==true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}