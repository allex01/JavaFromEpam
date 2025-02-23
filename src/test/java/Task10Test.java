import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

import com.esstu.java_from_epam.Task10.FileTypesProcessor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class Task10Test {
    @TempDir Path tempDir;

    @Test
    void test() throws Exception {
        File inputFile = tempDir.resolve("input.txt").toFile();
        try (FileWriter writer = new FileWriter(inputFile)) {
            writer.write("hello\n");
            writer.write("123\n");
            writer.write("@\n");
            writer.write("!\n");
            writer.write("90.01\n");
        }
        File outputFile = tempDir.resolve("output.txt").toFile();
        FileTypesProcessor processor = new FileTypesProcessor(inputFile.getAbsolutePath(), outputFile.getAbsolutePath());
        String[] types = {"char", "int"};
        processor.setTargetTypes(types);
        processor.process();
        assertTrue(outputFile.exists());
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            assertEquals("123", reader.readLine());
            assertEquals("@", reader.readLine());
        }
    }
}
