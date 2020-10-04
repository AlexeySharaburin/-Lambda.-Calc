package Calc;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) ->
    {
        int z = 0;
        if (y != 0) {
            z = x / y;
        } else {
            System.out.println("Невозможно выполнить операцию: деление на ноль!\nВыполнение программы деления прервано!");
        }
        return z;
    };


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}

