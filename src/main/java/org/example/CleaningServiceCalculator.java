package org.example;

import javax.swing.*;
import java.awt.*;

public class CleaningServiceCalculator extends JFrame {
    private JLabel totalCostLabel;
    private double sofaCost = 0;
    private double carpetsCost = 0;
    private double windowsCost = 0;
    private double kitchen = 0;
    private double wall = 0;
    private double complexProducts = 0;
    public CleaningServiceCalculator() {
        setTitle("Cleaning Service Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        JLabel squareMetersLabel = new JLabel("Площадь пола (10 руб за 1 кв/м): ");
        JTextField squareMetersField = new JTextField("0", 10);
        inputPanel.add(squareMetersLabel);
        inputPanel.add(squareMetersField);

        JPanel servicesPanel = new JPanel(new GridLayout(0, 1));

        ConcreteServiceCheckBox cleaningSofaCheckBox = new ConcreteServiceCheckBox(this,"Чистка дивана 1000р/шт", 1000);
        ConcreteServiceCheckBox cleaningCarpetsCheckBox = new ConcreteServiceCheckBox(this,"Мойка посуды 400р", 400);
        ConcreteServiceCheckBox cleaningWindowsCheckBox = new ConcreteServiceCheckBox(this,"Мойка окон 300р/шт", 300);
        ConcreteServiceCheckBox cleaningKithcenCheckBox = new ConcreteServiceCheckBox(this,"Мойка кухни 4000р", 4000);
        ConcreteServiceCheckBox cleaningWallCheckBox = new ConcreteServiceCheckBox(this,"Мойка стен 500р/стена", 500);
        ConcreteServiceCheckBox cleaningComplexProductsCheckBox = new ConcreteServiceCheckBox(this,"Сложные изделия 300р/шт", 300);

        servicesPanel.add(cleaningSofaCheckBox);
        servicesPanel.add(cleaningCarpetsCheckBox);
        servicesPanel.add(cleaningWindowsCheckBox);
        servicesPanel.add(cleaningKithcenCheckBox);
        servicesPanel.add(cleaningWallCheckBox);
        servicesPanel.add(cleaningComplexProductsCheckBox);

        JButton calculateButton = new JButton("Посчитать");
        calculateButton.addActionListener(e -> {
            double squareMeters = Double.parseDouble(squareMetersField.getText());
            double cleaningCost = (sofaCost + carpetsCost + windowsCost + kitchen + wall + complexProducts) + squareMeters * 10;
            totalCostLabel.setText("Общая стоимость: Р " + cleaningCost);
        });

        totalCostLabel = new JLabel("Общая стоимость: $0.0");

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(calculateButton);
        bottomPanel.add(totalCostLabel);

        add(inputPanel, BorderLayout.NORTH);
        add(servicesPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        inputPanel.setBackground(Color.YELLOW);
        cleaningSofaCheckBox.setBackground(Color.YELLOW);
        cleaningCarpetsCheckBox.setBackground(Color.YELLOW);
        cleaningWindowsCheckBox.setBackground(Color.YELLOW);
        cleaningKithcenCheckBox.setBackground(Color.YELLOW);
        cleaningWallCheckBox.setBackground(Color.YELLOW);
        cleaningComplexProductsCheckBox.setBackground(Color.YELLOW);
        bottomPanel.setBackground(Color.YELLOW);
        calculateButton.setBackground(Color.RED);
        setVisible(true);
    }
    public void setSofaCost(double sofaCost) {
        this.sofaCost = sofaCost;
    }
    public void setCarpetsCost(double sofaCost) {
        this.carpetsCost = sofaCost;
    }
    public void setWindowsCost(double sofaCost) {
        this.windowsCost = sofaCost;
    }
    public void setKitchen(double sofaCost) {
        this.kitchen = sofaCost;
    }
    public void setWall(double sofaCost) {
        this.wall = sofaCost;
    }
    public void setComplexProducts(double sofaCost) {
        this.complexProducts = sofaCost;
    }
}
