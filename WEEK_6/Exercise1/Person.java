class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public void displayInfo(){
        System.out.println("Person Information: ");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}

