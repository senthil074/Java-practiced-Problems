class Animal{
    void makesound(){
        System.out.println("hi");
    }
}
class cat extends Animal{
    void makesound(){
        System.out.println("bark");
    }
}
class Main{
    public static void main(String[]args){
        cat obj = new cat();
        obj.makesound();
    }
}
