import java.util.*;
class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String a = sc.nextLine();
            int n = a.length();
            int count = 1;
            char s = a.charAt(0),d='h';
            for (int i = 0; i < n-1; i++) {
                s = a.charAt(i);
                d = a.charAt(i+1);
                if (s==d){
                    count++;
                }
                else{
                    System.out.print(s + "" + count);
                    count=1;
                }
            }System.out.print(d + "" + count+"\n");
        }
    }
}