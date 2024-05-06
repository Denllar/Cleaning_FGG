package org.example;

public class ConcreteServiceCheckBox extends ServiceCheckBox {
    private CleaningServiceCalculator calculator;

    public ConcreteServiceCheckBox(CleaningServiceCalculator calculator, String text, double cost) {
        super(text, cost);
        this.calculator = calculator;
    }

    @Override
    public void updateCost(String text, double cost) {
        if (text.equals("Чистка дивана 1000р/шт")) {
            calculator.setSofaCost(cost);
        } else if (text.equals("Мойка посуды 400р")) {
            calculator.setCarpetsCost(cost);
        } else if (text.equals("Мойка окон 300р/шт")) {
            calculator.setWindowsCost(cost);
        } else if (text.equals("Мойка кухни 4000р")) {
            calculator.setKitchen(cost);
        } else if (text.equals("Мойка стен 500р/стена")) {
            calculator.setWall(cost);
        } else if (text.equals("Сложные изделия 300р/шт")) {
            calculator.setComplexProducts(cost);
        }
    }
}