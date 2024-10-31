package com.bomscoob.utils.impl;

import com.bomscoob.utils.interfaces.ICalculatorOperations;

public class CalculatorOperations implements ICalculatorOperations {
    @Override
    public int plus(int num1, int num2) {
        return num1+num2;
    }
    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }
    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }
    @Override
    public int divider(int num1, int num2) {
        return num1/num2;
    }
    @Override
    public int mod(int num1, int num2) {
        return num1%num2;
    }
}
