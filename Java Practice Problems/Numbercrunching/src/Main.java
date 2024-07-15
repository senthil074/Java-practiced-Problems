import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b=a.length();
        int sum=0;
        for(int i=0;i<b/2;i++) {
            char c = a.charAt(i);
            char ch = a.charAt(b - (i + 1));
            int d = Math.abs(Integer.parseInt(String.valueOf(c)) - Integer.parseInt(String.valueOf(ch)));
            sum += d;
            System.out.print(d + " ");
        }
        Integer.to
            System.out.println(sum);

    }
}
