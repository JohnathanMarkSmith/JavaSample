package org.JavaSample;


import java.io.*;

public class MoveFile {

    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        	        try {

            	            File oldFile = new File("/home/jsmith/outfile.txt");
            	            File newFile = new File("/home/jsmith//tmp/outfile.txt");
                        	            in = new FileInputStream(oldFile);
            	            out = new FileOutputStream(newFile);

            	            byte[] moveBuff = new byte[1024];

            	            int butesRead;

            	            while ((butesRead = in.read(moveBuff)) > 0) {
                	                out.write(moveBuff, 0, butesRead);
                	            }

            	            in.close();
            	            out.close();

            	            oldFile.delete();

            	            System.out.println("The File was successfully moved to the new folder");

            	        } catch (IOException e) {
            	            e.printStackTrace();
            	        }
            }

    }


