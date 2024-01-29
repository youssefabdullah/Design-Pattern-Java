package org.example.Observer;

public class Person implements Observer{
    private String name;
    public Person (String name){
        this.name=name;
    }


    @Override
    public void update(String availablity,String productName) {
        System.out.printf("%s Got new %s notification: %s%n",name,productName,availablity);
    }
}
