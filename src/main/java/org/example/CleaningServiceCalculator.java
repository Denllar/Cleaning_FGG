package org.example;

import javax.swing.*;
import java.awt.*;

public class CleaningServiceCalculator extends JFrame {
    private JLabel totalCostLabel;
    public CleaningServiceCalculator() {
        setTitle("Cleaning Service Calculator");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel();
        JPanel servicesPanel = new JPanel();

        JLabel perimetrLabel = new JLabel("Периметр стен(м): ");
        JTextField perimetrField = new JTextField("", 10);
        inputPanel.add(perimetrLabel);
        inputPanel.add(perimetrField);

        JLabel heightLabel = new JLabel("Высота стены(м): ");
        JTextField heightField = new JTextField("", 10);
        inputPanel.add(heightLabel);
        inputPanel.add(heightField);

        JLabel widthWallpaperLabel = new JLabel("Ширина рулона(м): ");
        JTextField widthWallpaperField = new JTextField("", 10);
        inputPanel.add(widthWallpaperLabel);
        inputPanel.add(widthWallpaperField);

        JLabel heightWallpaperLabel = new JLabel("Длина рулона(м): ");
        JTextField heightWallpaperField = new JTextField("", 10);
        inputPanel.add(heightWallpaperLabel);
        inputPanel.add(heightWallpaperField);

        servicesPanel.add(perimetrLabel);
        servicesPanel.add(perimetrField);

        servicesPanel.add(heightLabel);
        servicesPanel.add(heightField);

        servicesPanel.add(widthWallpaperLabel);
        servicesPanel.add(widthWallpaperField);

        servicesPanel.add(heightWallpaperLabel);
        servicesPanel.add(heightWallpaperField);

        JButton calculateButton = new JButton("Посчитать");
        calculateButton.addActionListener(e -> {
            double perimetr = Double.parseDouble(perimetrField.getText()) * Double.parseDouble(heightField.getText());
            double squareWallpaper = Double.parseDouble(widthWallpaperField.getText()) * Double.parseDouble(heightWallpaperField.getText());
            double quantity = Math.abs(perimetr / squareWallpaper);
            totalCostLabel.setText("Количество рулонов: " + quantity + " шт");
            JPanelApp mainWindow = new JPanelApp();
            mainWindow.setTxt1(quantity);
        });

        totalCostLabel = new JLabel("Количество рулонов: ");

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(calculateButton);
        bottomPanel.add(totalCostLabel);

        add(inputPanel, BorderLayout.NORTH);
        add(servicesPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        inputPanel.setBackground(Color.YELLOW);
        bottomPanel.setBackground(Color.YELLOW);
        calculateButton.setBackground(Color.RED);
        setVisible(true);
    }
}
