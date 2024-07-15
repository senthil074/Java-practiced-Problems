import java.util.Scanner;
class bankaccount{
    {System.out.println("enter amount existing amount:");}
    Scanner sc = new Scanner(System.in);
    int balance = sc.nextInt();
    void deposit(){
        System.out.println("enter amount for deposit:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        balance+=a;
        System.out.println(balance);
    }
    void withdrawl(){
    }
}
class Savingsaccount extends bankaccount{
    void withdrawl(){
        System.out.println("enter amount for withdrawl:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((balance-a)<=100){
            System.out.println("insufficient balance");
        }
        else{
            System.out.println(balance-a);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("click.1 for deposit and 2 for withdrawl");
        int a = sca.nextInt();
        Savingsaccount obj = new Savingsaccount();
        if (a==1){
             obj.deposit();
        }
        else{
            obj.withdrawl();
        }
    }
}