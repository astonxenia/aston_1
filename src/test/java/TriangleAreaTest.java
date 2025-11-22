import org.example.LessonSeven.TriangleArea;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TriangleAreaTest {
    @Test(description = "Положительные тесты для расчета площади треугольника")
    public void testValidTriangleArea() {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(TriangleArea.triangleArea(5, 12, 13), 30.0,
                "Площадь треугольника со сторонами 5, 12, 13 равна 30");
        soft.assertEquals(TriangleArea.triangleArea(7, 8, 9), 26.8328,
                "Площадь треугольника со сторонами 7, 8, 9 равна 26.8328");
        soft.assertAll();
    }

    @Test(description = "При отрицательных значениях и нуле выбрасывается исключение")
    public void testSideTriangleGreaterZero() {
        try {
            TriangleArea.triangleArea(0, 1, 2);
            assert false : "Ожидалось исключение для длины стороны <= 0";
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Длины сторон должны быть больше 0");
        }
        try {
            TriangleArea.triangleArea(1, -4, 7);
            assert false : "Ожидалось исключение для длины стороны <= 0";
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Длины сторон должны быть больше 0");
        }
    }

    @Test(description = "Несуществующий треугольник вызывает исключение")
    public void testInvalidTriangle() {
        try {
            TriangleArea.triangleArea(1, 2, 3);
            assert false : "Ожидалось исключение для несущствующего треугольника";
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Таких треугольников не существует");
        }
    }
}
