import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.esstu.java_from_epam.Task9.FileNumsProcessor;

public class Task9Test {

    @TempDir 
    Path tempDir;

    @Test
    public void readTest() throws Exception {
        File file = tempDir.resolve("test.txt").toFile();
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("1234.56,en\n");
            writer.write("1234.56,ru\n");
        }
        List<Double> expected = Arrays.asList(1234.56, 1234.0);
        assertEquals(expected, FileNumsProcessor.readFile(file.getAbsolutePath()));
    }
}
