public class Duck extends Animal {
    public void fly(){
        System.out.println("Утка летит в небе");
    }

    public void swim(){
        System.out.println("Утка купается в озере");
    }
    public void walk(){
        System.out.println("Утка ходит по земле");
    }
    public Duck(){

    }
    public Duck(String name,int age,double weight){
        super(name,age,weight);
    }
}
