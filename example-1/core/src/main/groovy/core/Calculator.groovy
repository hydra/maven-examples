package core

import calculator.Adder
import calculator.Subtractor

/**
 * Created by dominic.clifton on 18/07/2014.
 */
public class Calculator {

    private Adder adder
    private Subtractor subtractor


    public void setAdder(Adder calculator) {
        this.adder = calculator
    }

    void setSubtractor(Subtractor subtractor) {
        this.subtractor = subtractor
    }

    int addNumbers(int a, int b) {
        return adder.add(a,b)
    }

    int subtractNumbers(int a, int b) {
        return subtractor.subtract(a, b)
    }
}
