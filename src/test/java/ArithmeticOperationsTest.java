import org.example.LessonSeven.ArithmeticOperations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты для класса ArithmeticOperations")

public class ArithmeticOperationsTest {

    @Test
    @DisplayName("Сложение чисел")

    void  testAdd() {
        assertEquals(5, ArithmeticOperations.add(2,3), "2 + 3 = 5");
        assertEquals(-1, ArithmeticOperations.add(0, -1), "0 + (-1) = -1");
    }

    @Test
    @DisplayName("Вычитание чисел")

    void testSubtract() {
        assertEquals(6, ArithmeticOperations.subtract(10, 4), "10 - 4 = 6");
        assertEquals(15, ArithmeticOperations.subtract(10, -5), "10 - (-5) = 15");
    }

    @Test
    @DisplayName("Умножение")

    void testMultiply() {
        assertEquals(0.0, ArithmeticOperations.multiply(0, 20), "умножение на 0 = 0.0");
        assertEquals(18.0, ArithmeticOperations.multiply(6, 3), "6 * 3 = 18.0");
        assertEquals(-20.0, ArithmeticOperations.multiply(5, -4), "5 * (-4) = -20.0");
        assertEquals(22.5, ArithmeticOperations.multiply(1.5, 15), 0.00001, "1.5 * 15 = 22.5");
    }

    @Test
    @DisplayName("Деление двух чисел, только положительные тесты")

    void testDivision() {
        assertEquals(0, ArithmeticOperations.division(0, 5), "0 на любое число = 0");
        assertEquals(7, ArithmeticOperations.division(21, 3), "21 / 3 = 7");
        assertEquals(-9, ArithmeticOperations.division(-9, 1), "-9 / 1 = -9");
    }

    @Test
    @DisplayName("Деление на ноль")

    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArithmeticOperations.division(56, 0);
        });
        assertEquals("На ноль делить нельзя", exception.getMessage());
    }
}
