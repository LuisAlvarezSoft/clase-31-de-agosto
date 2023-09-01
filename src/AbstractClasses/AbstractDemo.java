package AbstractClasses;

abstract class AbstractDemo {
    public void myMethod(){
        System.out.println("Hello");
    }
    final public myMethod2(){
        System.out.println("Saludo");
    }
    abstract public void anotheMethod();
}
public class Demo extends AbstractDemo{
    public void anotherMethod(){
        System.out.println("Abstract Method");
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo() {
        obj.anotherMethod();
        }
    }
}

