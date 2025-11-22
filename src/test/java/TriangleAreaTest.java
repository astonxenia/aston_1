import org.example.LessonSeven.TriangleArea;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Тесты для класса Triangle")

public class TriangleAreaTest {

    @Test
    @DisplayName("Положительные тесты для расчета площади треугольника")

    void testValidTriangleArea () {
        double area = TriangleArea.triangleArea(5, 12, 13);
        assertEquals(30.0, area, 0.0001, "Площадь треугольника со сторонами 5, 12, 13 равна 30");
        double area2 = TriangleArea.triangleArea(7, 8, 9);
        assertEquals(26.8328, area2, 0.0001, "Площадь треугольника со сторонами 7, 8,  9 равна 26.8328");
    }

    @Test
    @DisplayName("При отрицательных значениях и нуле")

    void testSideTriangleGreaterZero() {
        IllegalArgumentException thrown1 = assertThrows(IllegalArgumentException.class,
                () -> TriangleArea.triangleArea(0, 1, 2));
        assertEquals("Длины сторон должны быть больше 0", thrown1.getMessage());
        IllegalArgumentException thrown2 = assertThrows(IllegalArgumentException.class,
                () -> TriangleArea.triangleArea(1, -4, 7));
        assertEquals("Длины сторон должны быть больше 0", thrown2.getMessage());
    }

    @Test
    @DisplayName("Несуществующий треугольник")

     void testInvalidTriangle() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> TriangleArea.triangleArea(1,2,3));
        assertEquals("Таких треугольников не существует", thrown.getMessage());
    }
}
