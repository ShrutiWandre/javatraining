package Day4;

public class BiNumber {

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public BiNumber(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addNumbers() {
        return number1 + number2;
    }

    public int multiplyNumbers() {
        return number1 * number2;
    }

    public void doubleNumber() {
        this.number1 *= 2;
        this.number2 *= 2;
    }

    public int subtractNumbers() {
        return number1 - number2;
    }

    public int divideNumbers() {
        return number1 / number2;
    }
}
