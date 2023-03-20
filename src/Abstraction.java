
//Data abstraction is a process of hidden certain details and showing only essential information to user
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("xxx");
    }
}
class pigs extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The pigs says : wee Wee");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        pigs myPig =new pigs();
        myPig.animalSound();
        myPig.sleep();
    }
}
