import java.util.*;
class shape{
    void getarea(){
        System.out.println( "hi");
    }
}
class rectange extends shape{
    void getarea(int x,int y){
        System.out.println(x*y);
    }
}
class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        rectange obj = new rectange();
        obj.getarea(a,b);
    }
}