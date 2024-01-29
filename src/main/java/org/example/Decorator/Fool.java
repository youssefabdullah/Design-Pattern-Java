package org.example.Decorator;

public class Fool extends SandwichDecorator{

    public Fool(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Fool";
    }
}
