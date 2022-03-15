public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);

        calc.ptintln.accept(c);

        /*
        ОШИБКА:
        Ошибка возникает в классе Main в строке №8 (деление на 0).
        Само деление происходит в классе Calculator в строке №10 во встроенном
        функциональном интерфейсе BinaryOperator<Integer> devide.

        СПОСОБ РЕШЕНИЯ:
        Данную проблему можно решить путём проверки делителя, в данном случае (y).
        Воспользуемся тернарным оператором y == 0 ? 0 : x / y;
        (если делитель будет равен 0, то всё выражение будет равно 0,
        иначе мы выполняем деление без каких-либо ошибок).
         */
    }
}
