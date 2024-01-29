package org.example.Decorator;

public abstract class SandwichDecorator implements Sandwich {
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public double getCost() {
        return sandwich.getCost();
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription();
    }
}
