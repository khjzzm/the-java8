package Inter;

import java.util.function.IntBinaryOperator;

class Driver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int calc(int n) {
                return n+1;
            }
        };

        calculator.calc(5);
        System.out.println(calculator.calc(5));

        Calculator cal = n -> n + 3;
        Calculator cal2 = (int n) -> { return n+2; };

        System.out.println(cal2.calc(5));



        IntBinaryOperator op1 = (int x, int y) -> {return Math.max(x, y);};
        IntBinaryOperator op2 = (x, y) -> Math.max(x, y);

        System.out.println(op2.applyAsInt(3, 7)); // 7

        IntBinaryOperator op = Math::max;
        System.out.println(op.applyAsInt(201, 200)); // 7

    }
}