import org.example.LessonSeven.Factorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты для класса Factortial")
public class FactorialTest {
    @DisplayName("Вычисление факториала от 0 и выше")
    @ParameterizedTest(name = "factorial {0} = {1}")
    @CsvSource( {"0, 1", "1, 1", "5, 120", "10, 3628800"})

    void testCalculateFactorial(int input, long expected) {
        assertEquals(expected, Factorial.calculateFactorial(input));
    }

    @DisplayName("Проверка исключений при отрицательном числе")
    @Test
    void negativeFactorial() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()  -> {
            Factorial.calculateFactorial(-1);
        });
        assertEquals("Число должно быть положительным", exception.getMessage());
        System.out.println("Ошибка: " + exception.getMessage());
    }
}
