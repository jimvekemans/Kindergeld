package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Collection;

public class CustomWriter {
    static PrintWriter printWriter;

    public CustomWriter(Path filePath) throws IOException {
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

    void writeAllToFile(Collection<String> strings) {
        strings.forEach(this::writeToFile);
    }

    void closeWriter() {
        printWriter.flush();
        printWriter.close();
    }
}
