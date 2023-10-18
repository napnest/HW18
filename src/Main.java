public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Лайка",5,10.5);
        dog.move();
        dog.play();
        dog.walk();
        System.out.println("****************");
        Duck duck = new Duck("Кряк",2,2.5);
        duck.fly();
        duck.swim();
        duck.walk();
        System.out.println("*****************");
        Animal animal = new Dog("Барбос",10,20.9);
        animal.walk();
        
    }
}
