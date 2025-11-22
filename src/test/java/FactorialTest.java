import org.example.LessonSeven.Factorial;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test(description = "Вычисление факториала от нуля и выше")
    public void testCalculateFactorial() {
        assertEquals(1, Factorial.calculateFactorial(0));
        assertEquals(1, Factorial.calculateFactorial(1));
        assertEquals(120, Factorial.calculateFactorial(5));
        assertEquals(3628800, Factorial.calculateFactorial(10));
    }

    @Test(description = "Проверка исключений при отрицательном числе",
            expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число должно быть положительным")

    public void testCalculateFactorialNegative() {
        Factorial.calculateFactorial(-1);
    }
}
