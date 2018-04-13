package person;

public class Person {
    //fields
    String name;
    int age;

    //constructor
    public Person(String name) {
        this.name = name;
        this.age=0;
    }

    String getName(){
        return name;
    }

    void birthday(){
        age = age + 1;
        System.out.println("Happy birthday!");
    }
}
