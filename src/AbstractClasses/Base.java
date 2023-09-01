package AbstractClasses;

abstract class Base {
    Base(){
        System.out.println("Base constructor called");
    }
    abstract void fun();
}
class Derived extends Base {
    Derived(){
        System.out.println("Derived constructor called");
    }

    @Override
    void fun() {
        System.out.println("Derived fun() called");
    }
}
class GFC{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}