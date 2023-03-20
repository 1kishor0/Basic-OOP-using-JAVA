
interface class1{
    public void method1();//interface method doesnot have a class body
    public void method2();//doesnot have a body
}
class class2 implements class1{
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}
public class Interface {
    public static void main(String[] args) {
        class2 objclass=new class2();
        objclass.method1();
        objclass.method2();

    }
}
// To achieve security - hide certain details and only show the important details of an object (interface).
//Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma (see example below).