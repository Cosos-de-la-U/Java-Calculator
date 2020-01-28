/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
/**
 *
 * @author Raul Penate
 */
public class Funciones {
    private double sum, minus, multiplication, division,squareRoot;
    private int isFound,periodCounter;
    private String removeSymbol;

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
    //Count every peroid in the text.
    public int getPeriodCounter(){
        return periodCounter;
    }
    
    public void setPeriodCounter(String string){
        char [] arrayChain;
        arrayChain = string.toCharArray();
        if (!string.equals("")) {
           for (int i = 0; i < string.length(); i++) {
            if (arrayChain[i] == '.') {
                this.periodCounter++;
            }else{
            periodCounter = 0;
            }
        } 
        }
        
    }
    
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

    public void setMultiplication(double valueOne, double valueTwo) {
        this.multiplication = valueOne * valueTwo;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double valueOne, double valueTwo) {
        this.division = valueOne / valueTwo;
    }
    
    public double getSquareRoot(){
    return this.squareRoot;
    }
    
    public void setSquareRoot(double valueOne){
        this.squareRoot = Math.sqrt(valueOne);
    }
}
