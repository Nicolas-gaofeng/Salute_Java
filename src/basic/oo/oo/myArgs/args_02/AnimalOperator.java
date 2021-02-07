package src.basic.oo.oo.myArgs.args_02;

public class AnimalOperator {

    public void useAnimal(Animal a) { // Animal a = new Cat();
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }

}
