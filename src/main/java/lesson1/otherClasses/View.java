package main.java.lesson1.otherClasses;

/**
 * Класс для вывода на экран
 */
public class View {

    /**
     * Просто приветственный текст
     */
    public static void welcome() {
        System.out.println("Welcome to this app!");
    }

    /**
     * Вывод на экран целочисленного значения
     * @param a
     * @return Форматированный текст
     */
    public static String intDecorate(int a){
        return String.format("Here is your number: %d", a);
    }

    /**
     * Вывод на экран дробного числа
     * @param a
     * @return Форматированный текст
     */
    public static String doubleDecorate(double a){
        return "Here is your number: " + a;
    }

}
