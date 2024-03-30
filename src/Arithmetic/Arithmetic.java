package Arithmetic;

public class Arithmetic {
    private final Number operand1;
    private final Number operand2;

    public Arithmetic(Number operand1, Number operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double add() {
        return operand1.doubleValue() + operand2.doubleValue();
    }

    public double subtract() {
        return operand1.doubleValue() - operand2.doubleValue();
    }

    public double multiply() {
        return operand1.doubleValue() * operand2.doubleValue();
    }

    public double divide() {
        if (operand2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return operand1.doubleValue() / operand2.doubleValue();
    }

    public double getMin() {
        return Math.min(operand1.doubleValue(), operand2.doubleValue());
    }

    public double getMax() {
        return Math.max(operand1.doubleValue(), operand2.doubleValue());
    }
}
