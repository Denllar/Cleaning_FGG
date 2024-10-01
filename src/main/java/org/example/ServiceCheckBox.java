package org.example;

import javax.swing.*;

public abstract class ServiceCheckBox extends JCheckBox {
    private double cost;

    public ServiceCheckBox(String text, double cost) {
        super(text);
        this.cost = cost;

        this.addActionListener(e -> {
            if (isSelected()) {
                updateCost(text, cost);
            } else {
                updateCost(text, 0);
            }
        });
    }

    public abstract void updateCost(String text, double cost);
}
