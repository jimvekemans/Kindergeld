package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class StreamWriter {
    static PrintWriter printWriter;

    public StreamWriter(Path filePath) throws IOException {
        printWriter = new PrintWriter(filePath.toString());
    }

    void writeToFile(String outputString) {
        try {
            printWriter.append(outputString);
            printWriter.append("\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void closeWriter() {
        printWriter.flush();
        printWriter.close();
    }
}
