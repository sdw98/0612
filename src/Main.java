class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    String breed;

    public Dog (String name, String breed) {
        super(name);
        this.breed = breed;
        }

    public void printName() {
        System.out.println("이름: " + name + ", 종 : " + breed);
    }

}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("쿠키","말티즈");

        if(dog instanceof  Dog) {
            Dog newDog = (Dog) dog;
            newDog.printName();
        }
    }
}