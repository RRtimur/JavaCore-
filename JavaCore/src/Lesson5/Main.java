package Lesson5;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        File file = new File("JavaCore/file.txt");
        AppData appData = new AppData();
        appData.setHeader(new String[]{"поле 1", "поле 2", "поле 3"});
        appData.setData(new int[][]{
                {304,200,230},
                {20,30,40}
        });
        appData.save();



        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            String[] strMass;
            while ((str = reader.readLine()) != null) {

                strMass = str.split(";");
                System.out.println(Arrays.toString(strMass));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
