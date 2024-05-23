package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // Реализация Альтернативного варианта (закоментированные строки)
        //Деление на ноль. Для обработки ошибки  Использую блок try-catch для
        //обработки исключения "Arithmetic Exception"
        //  try {
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        //   } catch (ArithmeticException e) {
        //   System.out.println(e.getMessage() );

        // }
    }
}
