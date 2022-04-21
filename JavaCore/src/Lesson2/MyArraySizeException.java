package Lesson2;

public class MyArraySizeException extends  ArithmeticException{

    private static String str = "Указанный массив не имеет размер 4х4";

    public MyArraySizeException() {
        super(str);
    }

    public MyArraySizeException(String s) {
        super(s);
    }
    }
