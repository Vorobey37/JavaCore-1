package main.java.lesson1.mainClass;


import main.java.lesson1.otherClasses.Logic;
import main.java.lesson1.otherClasses.View;

public class Main {
    public static void main(String[] args) {

        View.welcome();
        System.out.println(View.intDecorate(Logic.add(4, 6)));
        System.out.println(View.doubleDecorate(Logic.div(10, 4)));
        System.out.println(View.intDecorate(Logic.mul(2,3)));
        System.out.println(View.intDecorate(Logic.sub(7,3)));



    }
}