package maluevArtem.homework_1_1;

class Main {

    public static void main(String[] args) {

		/*
		Исключение выпадает при выполнении операции деления, если знаменатель равен 0
		Способ обработки ошибки:
		BinaryOperator<Integer> devide = (x, y) -> {
            int c;
		    try {
                c = x / y;
            }
            catch (Exception e) {
                System.out.print("На ноль делить нельзя, знаменатель b = ");
                c = 0;
            }
            return c;
        };
		*/

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
