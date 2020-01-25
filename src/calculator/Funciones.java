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

    double sum, minus, multiplication, division;

    public Funciones(double sum, double minus, double multiplication, double division) {
        this.sum = sum;
        this.minus = minus;
        this.multiplication = multiplication;
        this.division = division;
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

    public void setMinus(double minus) {
        this.minus = minus;
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
