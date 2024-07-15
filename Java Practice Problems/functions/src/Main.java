//package ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[]args) {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        for(int i=0;i<size;i++) {
            int s = sc.nextInt();
            arr.add(arr [i+2] =s);
        }
        System.out.println(arr);
    }

}
