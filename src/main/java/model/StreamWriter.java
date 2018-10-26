package model;

import java.io.FileWriter;
import java.io.IOException;

public class StreamWriter {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    //CSV file header
    private static final String FILE_HEADER = "id,firstName,lastName,gender,age";

    public static void main(String[] args) {

        FileWriter fileWriter = null;

        try{
           fileWriter = new FileWriter("/Users/lesleyh/TestBestanden/test.csv");

           fileWriter.append(FILE_HEADER.toString());

            System.out.println("CSV file was created successfully !!!");
        }catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        }finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }


    }
}
