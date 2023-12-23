
public class Main {


    public static void main(String[] args) {

        Double number1 = 10.5;
        Float number2 = 10.5f;
        Long number3 = 10L;
        Integer number4 = 10;
        Short number5 = 10;
        Byte number6 = 10;
        Integer number7  = 0;
        Integer number8 = null;

        //Задание №1
        Calculator calculator = new Calculator();
        try {
            calculator.sum(number2, number5);
            calculator.sum(number3, number6);
            calculator.multiply(number1, number4);
            calculator.multiply(number5, number6);
            calculator.subtract(number2, number5);
            calculator.subtract(number3, number6);
            calculator.divide(number1, number4);
            calculator.divide(number5, number6);
            calculator.divide(number6, number7);
            calculator.sum(number1, number8);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        //Задание №2
        Object []array1 = new Object[]{number1, number2, number3, number4};
        Object []array2 = new Object[]{number1, number2};
        Number []array3 = new Number[]{number1, number2, number3, number7};
        Number []array4 = new Number[]{number5, number2, number3, number7};

        System.out.println(compareArrays(array1, array3)); //true
        System.out.println(compareArrays(array2, array3)); //false
        System.out.println(compareArrays(array1, array4)); //false

        //Задание №3
        String key = "Ключ";
        Integer value = 21;
        Pair <String, Integer> pair = new Pair<>(key, value);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }

    static  <T1, T2> boolean compareArrays(T1[]array1, T2[]array2){

        boolean flag;
        if (array1.length != array2.length){
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {

                if(!array1[i].getClass().isInstance(array2[i])){
                    return false;
                }
            }
            return true;
        }

    }
}

