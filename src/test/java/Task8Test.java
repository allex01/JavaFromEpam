import org.junit.Test;
import static org.junit.Assert.*;
import com.esstu.java_from_epam.Task8.TextCostCalculator;

public class Task8Test {
    @Test
    public void testBasicText() {
        String text = "Hello, world!";
        assertEquals(1.0, TextCostCalculator.calculateCost(text, 0.5), 0.001);
    }

    @Test
    public void specialText(){
        String text = "Lorem? ipsum?color,sit amet! Consectetur...adipiscing elit, sed do   ";
        assertEquals(10.0, TextCostCalculator.calculateCost(text, 1.0), 0.001);
    }

    @Test
    public void testEmptyText() {
        String text = "";
        assertEquals(0.0, TextCostCalculator.calculateCost(text, 0.5), 0.001);
    }
}
