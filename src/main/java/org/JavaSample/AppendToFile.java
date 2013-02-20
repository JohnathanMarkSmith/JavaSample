package org.JavaSample;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        try {

            String newData = "Java is the best.";

            FileWriter fileWritter = new FileWriter("test.txt", true);


            BufferedWriter bwr = new BufferedWriter(fileWritter);

            bwr.write(newData);
            bwr.close();

        } catch (IOException e) {

            e.printStackTrace();

        }


    }
}
