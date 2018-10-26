package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class StreamWriter {
    static PrintWriter printWriter;

    public StreamWriter(String filePath) throws IOException {
        printWriter = new FileWriter(filePath);
    }

    public StreamWriter(Path filePath) throws IOException {
        printWriter = new FileWriter(filePath.toString());
    }

    static void writeToFile(String outputString) {
        try {
            printWriter.append(outputString);
        } catch (IOException ioe) {

        } finally {
            try {
                printWriter.flush();
                printWriter.close();
            } catch (IOException ioe) {
                System.out.println("COULD NOT CLOSE FILEWRITER!");
            }
        }
    }

}
