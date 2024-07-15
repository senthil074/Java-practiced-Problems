import java.util.*;
class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int fin=1;
            for (int i=1;i<b;i++){
                fin=fin*10;
            }
            fin=fin+(a-1);
            System.out.println(fin);
        }
    }
}