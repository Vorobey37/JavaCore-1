package main.java.lesson1.otherClasses;

/**
 * Класс, в котором выполняется вся логика
 */
public class Logic {

    /**
     * Сложение чисел
     * @param a
     * @param b
     * @return сумма a и b
     */
    public static int add(int a, int b){
        return a + b;
    }

    /**
     * Деление чисел
     * @param a
     * @param b
     * @return результат деления числа a на число b
     */
    public static double div(int a, int b){
        return (double) a / (double) b;
    }

    /**
     * Умножение чисел
     * @param a
     * @param b
     * @return произведение a и b
     */
    public static int mul(int a, int b){
        return a * b;
    }

    /**
     * Вычитание чисел
     * @param a
     * @param b
     * @return Разность чисел a и b
     */
    public static int sub(int a, int b){
        return  a - b;
    }
}
