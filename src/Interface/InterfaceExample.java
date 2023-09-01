package Interface;

public class InterfaceExample {
    interface Player
    {
        final int id = 10;
        int move();
    }
    public interface In1{
        final int a = 10;
        public void display();
    }
    class TestClass implements In1{
        public void display(){
            System.out.println("Saludos a todos!");
        }

        public static void main(String[] args) {
            TestClass t = new TestClass();
            t.display();
            System.out.println(a);
        }
    }
}
