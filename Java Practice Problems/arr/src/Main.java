import java.util.*;
class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int arr []=new int [21];
        int tslot = 21;
        boolean result=false;
        while(true){
            System.out.println("\nEnter 1 to park and 0 to take out\n");
            int a = sc.nextInt();
            if (a==1) {
                System.out.println("you selected for park,enter your vehicle number");
                int number = sc.nextInt();
                System.out.println("Enter slot 1 - 20");
                int slot = sc.nextInt();
                if (arr[slot] == 0) {
                    arr[slot] = number;
                    System.out.println("Your vehicle parked at slot "+ slot);
                    tslot--;
                } else {
                    System.out.println("Slot "+ slot +" already booked");
                }
            }
            else if (a==0){
                System.out.println("You selected for out,enter your vehicle number");
                int onumber = sc.nextInt();
                for (int i=0;i<21;i++){
                    if (arr[i]==onumber){
                        result = true;
                        arr[i]=0;
                    }
                }
                if (result == true){
                    System.out.println("Your vehicle"+ onumber +" is out now");
                }
                else{
                    System.out.println("Your vechile "+ onumber +" is not here");
                }
            }
            else {
                System.out.println("Enter a vaild option 1 or 0");
            }
        }
    }
}