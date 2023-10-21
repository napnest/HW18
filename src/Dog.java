public class Dog extends Animal {
    public void move(){
        System.out.println("Собакак бежит по земле");
    }

    public void play(){
        System.out.println("Собака играет с мячиком");
    }
    public void walk(){
        System.out.println("Собака ходит по земле");
    }
    public Dog(){

    }
    public Dog(String name,int age, double weight){
        super(name,age,weight);
    }
}
