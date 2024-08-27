import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Week4Exercise1Part2Test {
        private String shortFile;
        private String longFile;
        private String userWord1;
        private String userWord2;

        @BeforeEach
        public void setUpFiles() {
            shortFile = "test-short.txt";
            longFile = "test-long.txt";
            userWord1 = "a";
            userWord2 = "is";
        }

        @Test
        public void shortTest() {
            int actual = Week4Exercise1Part2.countWords(shortFile, userWord1);
            int expected = 4;
            assertEquals(actual, expected);
        }

        @Test
        public void longTest() {
            int actual = Week4Exercise1Part2.countWords(longFile, userWord2);
            int expected = 122;
            assertEquals(actual, expected);
        }
    }
