package Lesson5;

import java.io.*;

public class AppData implements Serializable {


    private String[] header;
    private int[][] data;
    File file = new File("JavaCore/file.txt");


    public void save(){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < header.length; i++) {
                writer.write(header[i]+";");
            }
            for (int i = 0; i < data.length; i++) {
                writer.write("\n");
                for (int j = 0; j < data[0].length; j++) {
                    writer.write(data[i][j]+";");

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public void setHeader(String[] header) {
        this.header = header;
    }



    public void setData(int[][] data) {
        this.data = data;
    }



}
