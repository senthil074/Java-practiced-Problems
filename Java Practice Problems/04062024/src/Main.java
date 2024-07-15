import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DD-MM-YYYY");
        String input = sc.next();
        String[] inp = input.split("-");
        int days = Integer.parseInt(inp[0]);
        int month = Integer.parseInt(inp[1]);
        int year = Integer.parseInt(inp[2]);
        boolean result = false;
        int c;

            if (year >= 1200 && year < 9999) {
                result = true;

            if (month > 0 && month <= 12) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (days==31){
                        result=true;
                    }
                    else{
                        result=false;
                    }
                } else if (month == 2) {
                    if (year % 4 == 0) {
                        if (days==29){
                            result=true;
                        }
                        else{
                            result=false;
                        }
                    } else {
                        if (days==28){
                            result=true;
                        }
                        else{
                            result=false;
                        }
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (days==30){
                        result=true;
                    }
                    else{
                        result=false;
                    }
                } else {
                    c = 0;

                }
            } else {
                result = false;

            }

        }
        if (result == true) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        System.out.println("hi");
    }
}