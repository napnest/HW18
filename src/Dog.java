public class Dog extends Animal {
    public void move(){
        System.out.println("Собакак бежит по земле");
    }

    public void play(){
        System.out.println("Собака играет с мячиком");
    }
    public Dog(){

    }
    public Dog(String name,int age, double weight){
        super(name,age,weight);
    }
}
