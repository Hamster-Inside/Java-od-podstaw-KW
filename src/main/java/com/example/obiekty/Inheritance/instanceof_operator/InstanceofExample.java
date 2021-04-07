package com.example.obiekty.Inheritance.instanceof_operator;
class Animal{
    protected String name;
    protected float weight; //kg
    protected int  years;
    protected int numLegs;
    public Animal(){}
    public Animal (String name){
        this.name = name;
    }
}
class Dog extends Animal {
    protected String color;
    public Dog(){

    }
    protected void bark(){
        System.out.println("Dog bark");

    }
    public Dog (String name){
        super(name);
    }
}
class Snake extends Animal {
    protected String venom;
    protected int killedHumans;
    protected void bite(){
        System.out.println("Snake attack");

        }
        public Snake(){}
    public Snake (String name){
        super(name);
    }
}
class SmallDog extends Dog{
    protected String petName;
    public SmallDog(){}
   public SmallDog(String name){
        super(name);
    }
}
public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Snake snake = new Snake();
        SmallDog smallDog = new SmallDog();
        System.out.println(animal instanceof Animal);
        System.out.println(smallDog instanceof Dog);
        System.out.println(smallDog instanceof Animal);
        System.out.println(animal instanceof SmallDog);
        Animal doggy = new SmallDog("doggy");
        SmallDog doggy2 = new SmallDog("doggy2");
        System.out.println(doggy.name);
        System.out.println(doggy2.name);



    }
}
