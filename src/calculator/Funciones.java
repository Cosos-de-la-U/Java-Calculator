/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.calculatorView;

/**
 *
 * @author admin
 */
public class Funciones {

    private double sum, minus, multiplication, division;
    private int operation, isFound;
    private String removeSymbol,secondScreenData;

    public int getisFound() {
        return isFound;
    }

    //To know which operation the calculator is gonna do.
    public void setisFound(String symbol) {
        boolean opSum = symbol.contains("+");
        boolean opMinus = symbol.contains("-");
        boolean opMultiplication = symbol.contains("*");
        boolean opDivision = symbol.contains("/");
        if (opSum == true) {
            this.isFound = 1;
        } else if (opMinus == true) {
            this.isFound = 2;
        } else if (opMultiplication == true) {
            this.isFound = 3;
        } else if (opDivision == true) {
            this.isFound = 4;
        } else {
            this.isFound = 0;
        }
    }

    //To erease the symbol and do the math
    public void setRemoveSymbol(String number,String symbol) {
        if (number.contains(symbol)) {
            String order = " " + symbol;
            removeSymbol = number.replace(order, "");
        }
    }

    public String getRemoveSymbol() {
        return removeSymbol;
    }
    
    //Second Screen data, to save the recent operations, maybe in the future, not necessary
    /*public void setSecondScreendData(String firstScreen, String secondScreen){
    secondScreenData = secondScreen + firstScreen;
    }
    
    public String getSecondScreeData(){
    return secondScreenData;
    }*/
    
    public double getSum() {
        return sum;
    }

    public void setSum(double valueOne, double valueTwo) {
        this.sum = valueOne + valueTwo;
    }

    public double getMinus() {
        return minus;
    }

    public void setMinus(double valueOne, double valueTwo) {
        this.minus = valueOne - valueTwo;
    }

    public double getMultiplication() {
        return multiplication;
    }

    public void setMultiplication(double multiplication) {
        this.multiplication = multiplication;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

}
