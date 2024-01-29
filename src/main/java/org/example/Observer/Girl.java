package org.example.Observer;

public class Girl implements Observer{
    private String name;
    private int age;
    public Girl (String name,int age){
        this.name=name;
        this.age=age;
    }


    @Override
    public void update(String availablity,String productName) {
        System.out.printf("%s %s Got new %s notification: %s%n",name,age,productName,availablity);
    }
}
