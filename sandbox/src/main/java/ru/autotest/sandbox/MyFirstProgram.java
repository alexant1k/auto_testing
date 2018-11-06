package ru.autotest.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("alex");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle (5,5);
        System.out.println("Площадь треуголника со стороной " + r.a + " и " + r.b + " = " + r.area());
    }
    public  static  void  hello(String somebody){
        System.out.println("Hello," +somebody+ "!");
    }

    }








