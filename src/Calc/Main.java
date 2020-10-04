package Calc;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int x = -5;

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        boolean d = calc.isPositive.test(a);
        int e = calc.abs.apply(x);
        int f = calc.pow.apply(a);
        int g = calc.multiply.apply(x, f);

        System.out.format("Результат деления чисел %d и %d: ", a, b);
        calc.println.accept(c);

        System.out.format("Положительно ли число %d?: ", a);
        System.out.println(d);

        System.out.format("Модуль числа %d: ", x);
        calc.println.accept(e);

        System.out.format("Результат возведения в степень числа %d: ", a);
        calc.println.accept(f);

        System.out.format("Результат перемножения чисел %d и %d: ", x, f);
        calc.println.accept(g);

    }
}

