package Lesson2;

public class MyArrayDataException extends  ArithmeticException{

        private static String str = "Невозможно перевести этот элемент в число!";

        public MyArrayDataException() {
            super(str);
        }

        public MyArrayDataException(String s) {
            super(s);
        }
}
