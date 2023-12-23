public class Calculator {
    private Number result;
    public <T1 extends Number, T2 extends Number> void sum(T1 number1, T2 number2){

        if ((number1 instanceof Double) || (number2 instanceof Double) || (number1 instanceof Float) || (number2 instanceof Float)){
            result = number1.doubleValue() + number2.doubleValue();
            System.out.println(result);
        } else {
            result = number1.longValue() + number2.longValue();
            System.out.println(result);
        }
    }

    public <T1 extends Number, T2 extends Number> void multiply(T1 number1, T2 number2){

        if ((number1 instanceof Double) || (number2 instanceof Double) || (number1 instanceof Float) || (number2 instanceof Float)){
            result = number1.doubleValue() * number2.doubleValue();
            System.out.println(result);
        } else {
            result = number1.longValue() * number2.longValue();
            System.out.println(result);
        }
    }

    public <T1 extends Number, T2 extends Number> void divide(T1 number1, T2 number2){

        if ((number1 instanceof Double) || (number2 instanceof Double) || (number1 instanceof Float) || (number2 instanceof Float)){
            result = number1.doubleValue() / number2.doubleValue();
            System.out.println(result);
        } else {
            result = number1.longValue() / number2.longValue();
            System.out.println(result);
        }
    }

    public <T1 extends Number, T2 extends Number> void subtract(T1 number1, T2 number2){

        if ((number1 instanceof Double) || (number2 instanceof Double) || (number1 instanceof Float) || (number2 instanceof Float)){
            result = number1.doubleValue() - number2.doubleValue();
            System.out.println(result);
        } else {
            result = number1.longValue() - number2.longValue();
            System.out.println(result);
        }
    }


}
