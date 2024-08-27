import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Week4Exercise1Part1Test {
    private String shortFile;
    private String longFile;

    @BeforeEach
    public void setUpFiles() {
        shortFile = "test-short.txt";
        longFile = "test-long.txt";
    }

    @Test
    public void shortTest() {
        int actual = Week4Exercise1Part1.countWords(shortFile);
        int expected = 47;
        assertEquals(actual, expected);
    }

    @Test
    public void longTest() {
        int actual = Week4Exercise1Part1.countWords(longFile);
        int expected = 17308;
        assertEquals(actual, expected);
    }
}