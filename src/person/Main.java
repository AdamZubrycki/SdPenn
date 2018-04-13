package person;

public class Main {

    public static void main(String[] args) {
        Person newPerson = new Person("John");
        System.out.println(newPerson.name+" is "+newPerson.age+" years old.");
        newPerson.birthday();
        System.out.println(newPerson.name+" is "+newPerson.age+" years old.");
    }
}
