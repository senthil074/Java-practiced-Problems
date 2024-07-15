//method overloading
 import java.util.*;
class person{
    Scanner sc = new Scanner(System.in);
    void getfristname(String fs){

        System.out.println(fs);
    }
    void getlastname(String ls){
        System.out.println(ls);
    }
}
class employee extends person{
    Scanner sc = new Scanner(System.in);
    void empid1(String empid){
        System.out.println(empid);
    }
    void getlastname(String ls, String empid){
        System.out.println(ls+","+empid);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a=sc.next();
        String b=sc.next();
        String emp=sc.next();
        employee obj = new employee();
        obj.empid1(emp);
        obj.getfristname(a);
        obj.getlastname(b,emp);
        obj.getlastname(a);
    }
}