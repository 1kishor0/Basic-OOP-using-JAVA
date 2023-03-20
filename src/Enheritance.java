class Annimal{
    public void animalSound(){
        System.out.println("Makes a sound ");
    }
}

class pigss extends Annimal{
    @Override
    public void animalSound() {
        System.out.println("wee wee");
    }
}
class Dog extends Annimal{
    @Override
    public void animalSound() {
        System.out.println("Ghew Ghew");
    }
}
public class Enheritance {
    public static void main(String[] args) {

        Annimal mAnimal=new Annimal();
        Annimal mPig=new pigss();
        Annimal mDog=new Dog();
        mAnimal.animalSound();
        mPig.animalSound();
        mDog.animalSound();
    }
}