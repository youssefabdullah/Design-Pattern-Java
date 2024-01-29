package org.example.Observer;

public class ObserverMain {
    public static void main(String[] args) {
        Product product = new Product("Phone");

        Person person = new Person("ahmed");
        Person person1 = new Person("youssef");
        Person person2 = new Person("atef");

        Girl girl = new Girl("Dina",15);

        product.add(person);
        product.add(person1);
        product.add(person2);
        product.add(girl);

        product.setAvailablity(false);
    }
}
