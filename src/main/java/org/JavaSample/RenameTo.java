package org.JavaSample;


import java.io.*;

public class RenameTo {

    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {

            File oldFile = new File("/home/jsmith/outfile.txt");

            if (oldFile.renameTo(new File("/home/jsmith/tmp/"+ oldFile.getName()))) {
                System.out.println("The file was moved successfully to the new folder");
            } else {
                System.out.println("The File was not moved.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}


