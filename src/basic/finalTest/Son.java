package basic.finalTest;

public class Son extends Father{
    final int age;//报错

    public Son(){
        age = 10;
    }
    public void show(){
        System.out.println("Son");
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father father = son;
    }
}
