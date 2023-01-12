public class Main {
    public static void main(String[] args) {
        byte varByte = 100;
        short varShort = 1000;
        int varInt = 1000000;
        long varLong = -100000000L;
        float varFloat = 0.0F;
        double varDouble = 0.1d;
        byte varByte1 = (byte) (varByte*2);
        int varInt1 = (int) (varInt*varLong);
        var number = varInt+varDouble;
        var number1 = varInt-varDouble;
        var number2 = varInt*varDouble;
        var number3 = varInt/varDouble;

        System.out.println(varByte+varShort);
        System.out.println(varInt-varShort);
        System.out.println(varLong/varInt);
        System.out.println(varByte*varShort);

        //переполнение
        System.out.println(varByte1);
        System.out.println(varInt1);

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}

