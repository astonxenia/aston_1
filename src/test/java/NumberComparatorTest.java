import org.example.LessonSeven.NumberComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Тест для класса NumberComparator")

public class NumberComparatorTest {

    @ParameterizedTest(name = "{0} : {1} -> {2}")
    @CsvSource({"1, 1, Числа равны",
            "4, 3, Числа не равны",
            "0, 0, Числа равны",
    "-1, -1, Числа равны",
    "-1, 1,  Числа не равны"})

    void testCompare(int a, int b, String expected) {
        assertEquals(expected, NumberComparator.compare(a, b));
        }
    }

