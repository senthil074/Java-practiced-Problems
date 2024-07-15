import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Enter symbols 1-> caps only 2->small only   3->numbers only 4->all");
        int b = sc.nextInt();
        String msg = "";
        if (b == 1) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    msg = msg + a.charAt(i);
                }
            }
        }
        if (b == 2) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    msg += a.charAt(i);
                }
            }
        }
        if (b == 3) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (c >= '0' && c <= '9') {
                    msg += a.charAt(i);
                }
            }
        }
        if (b==4){
            for (int i=0;i<a.length();i++){
                char c=a.charAt(i);
                msg +=a.charAt(i);
                }
            }
        try{
            File f = new File("F:\\File Handling\\demo.txt");
            FileWriter fw = new FileWriter(f);
            fw.write(msg);
            fw.close();
            System.out.println("process over");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}