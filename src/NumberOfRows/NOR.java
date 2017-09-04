package NumberOfRows;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class NOR {

    public static void main(String[] args) {
        FilesFromDir filesFromDir = new FilesFromDir();
        System.out.println(String.valueOf(filesFromDir));

    }
/*        try {
            File file = new File("src/NumberOfRows/NOR.java");
            FileReader fileReader = new FileReader(file);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            int LineNumber = 0;

            while (lineNumberReader.readLine() != null) {
                LineNumber++;
            }

            System.out.println(LineNumber);
            lineNumberReader.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }*/


}