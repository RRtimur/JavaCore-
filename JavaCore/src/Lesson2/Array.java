package Lesson2;

public class Array implements  AutoCloseable {
    private int x;
    private int y;
    private String str;
    private static int sum = 0;
    String[][] massive = new String[x][y];


    public static void makeArray(int x, int y) {

        String[][] massive = new String[x][y];
        int [][] massiveInt = new int[x][y];


        if (x != 4 || y != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[0].length; j++) {
                massive[i][j] = "2" + i + j;
//                massive[3][3] = "s";
                if (massive[i][j].matches("[0-9]+")  ){
                    massiveInt[i][j]=Integer.parseInt(massive[i][j]);
                    sum = massiveInt[i][j]+sum;


                }else{
                    System.out.println(i +" " + j + " Элемент в этой ячейке, не является числом ");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println("Сумма всех чисел в ячейках массива равна - "+sum);

        for (int i = 0; i < massiveInt.length; i++) {
            for (int j = 0; j < massiveInt[0].length; j++) {
                System.out.print(massiveInt[i][j] + " ");

            }
        }


    }
// не знаю работает ли у меня этот метод, не понял как проверить(
    @Override
    public void close() throws Exception {
        for (int i = 0; i <massive.length ; i++) {
            for (int j = 0; j <massive[0].length ; j++) {
                massive[i][j]=null;
                System.out.println(massive[i][j]);
            }

        }

    }
}
