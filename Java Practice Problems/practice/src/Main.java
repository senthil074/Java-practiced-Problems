import  java.util.*;
class Main{
    public static void main(String[] args) {
//        while (true) {
            Scanner sc = new Scanner(System.in);
            int starting = sc.nextInt();
            int ending = sc.nextInt();
            int count ;
            for (int i = starting; i <=ending; i++) {
                count = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count < 2) {

                    System.out.println(i + "    is  Prime");
                }
//                else {
//                    System.out.println(i + " is prime");
//                }
            }

//        }
    }
}
