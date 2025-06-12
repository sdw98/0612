class Animal {
    String name;

    public Animal(String name) { //생성자
        this.name = name;       //구별하기 위해 this
    }

    public void printName() {
        System.out.println("Animal name : " + this.name);
    }
}

class Dog extends Animal {
    String breed;

    public Dog (String name, String breed){
        super(name);    //super는 첫줄
        this.breed = breed;

    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("하루", "프렌치불독");

        dog.printName();
    }
}