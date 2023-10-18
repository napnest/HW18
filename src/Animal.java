public class Animal {
    private double weight;
    private  int age;
    private String name;
    public Animal(){

    }
    public Animal(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void walk(){
        System.out.println("Животное идет по земле");
    }


}
