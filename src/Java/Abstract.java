package Java;

public class Abstract {
    public static void main(String[] args) {
        B b=new B();
        b.callme();

    }


}
    abstract class A{
        abstract void callme();
    }
    class B extends A{
        void callme(){
            System.out.println("B " + "implements "+ "Callme");
        }
    }