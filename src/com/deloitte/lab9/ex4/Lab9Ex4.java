package com.deloitte.lab9.ex4;

class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

interface PersonFactory {
    Person create(String name, int age);
}


public class Lab9Ex4 {

	public static void main(String[] args) {
		
		
        PersonFactory personFactory = Person::new;

        
        Person person = personFactory.create("John", 30);

        
        System.out.println(person);

	}

}
