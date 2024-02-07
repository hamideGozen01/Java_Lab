/*
Exercise 1: Person Class
(1) Create a Person class with the following attributes:
• name (String)
• age (int)
(2) Implement a constructor to initialize the name with empty string and age attributes with
0.
(3) Add a method named displayInfo to the Person class that displays information about the
person.
(4) Create an instance of the Person class in the Main class and demonstrate the usage of the
displayInfo method.
*/



public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", 30);
        person1.displayInfo();
        Person person2 = new Person("Damla", 19);
        person2.displayInfo();

    }
}