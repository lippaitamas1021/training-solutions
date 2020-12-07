package operators;

public class OperatorsMain {
    public static void main(String[] args) {

        Operators operators = new Operators();
        System.out.println(operators.isEven(9));
        System.out.println(operators.isEven(8));

        System.out.println(Integer.toBinaryString(100));

        System.out.println(16 >> 1);
        System.out.println(16 << 1);
        System.out.println(13 >> 1);
        System.out.println(13 << 1);

        System.out.println(operators.multiplyByPowerOfTwo(3, 3));

        operators.convert();
        operators.cannotConvert();

    }
}
