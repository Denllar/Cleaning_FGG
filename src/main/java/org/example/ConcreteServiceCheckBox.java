package org.example;

public class ConcreteServiceCheckBox extends ServiceCheckBox {
    private CleaningServiceCalculator calculator;

    public ConcreteServiceCheckBox(CleaningServiceCalculator calculator, String text, double cost) {
        super(text, cost);
        this.calculator = calculator;
    }

    @Override
    public void updateCost(String text, double cost) {

    }
}