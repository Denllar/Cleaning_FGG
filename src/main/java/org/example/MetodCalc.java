package org.example;

public class MetodCalc
{
    public double calc ( double n1, String op, double n2)
    {
        double res = 0;
        switch (op)
        {
            case "+":
                res = n1+n2;
                break;
            case "-":
                res = n1-n2;
                break;
            case "*":
                res = n1*n2;
                break;
            case "/":
                res = n1/n2;
                break;
            case "X^2":
                res = n1*n1;
                break;
            case "√":
                res = Math.sqrt(n1);
                break;
            case "+-":
                res = n1 - n1*2;
                break;
            case "1/x":
                res = 1/n1;
                break;
            case "log":
                res = Math.log(n1);
                break;
            case "delete":
                res = 0;
                break;
            case "mainRes":
                res = n1;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}