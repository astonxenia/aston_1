import org.example.LessonSeven.ArithmeticOperations;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ArithmeticOperationsTest {
    @Test(description = "Сложение числе")
    public void testAdd() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ArithmeticOperations.add(2, 3), 5.0,
                "2 + 3 = 5");
        softAssert.assertEquals(ArithmeticOperations.add(0, -1), -1.0,
                "0 + (-1) = -1");
        softAssert.assertAll();
    }

    @Test(description = " Вычитание чисел")
    public void testSubtract() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ArithmeticOperations.subtract(10, 4), 6.0, "10 - 4 = 6");
        softAssert.assertEquals(ArithmeticOperations.subtract(10, -5), 15.0, "10 - (-5) = 15");
        softAssert.assertAll();
    }

    @Test(description = "Умножение")
    public void testMultiply() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ArithmeticOperations.multiply(0, 20), 0.0,
                "умножение на 0 = 0.0");
        softAssert.assertEquals(ArithmeticOperations.multiply(6, 3), 18.0,
                "6 * 3 = 18.0");
        softAssert.assertEquals(ArithmeticOperations.multiply(5, -4), -20.0,
                "5 * (-4) = -20.0");
        softAssert.assertAll();
    }

    @Test(description = "Деление двух чисел, только положительные тесты")
    public void testDivision() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ArithmeticOperations.division(0, 5), 0.0,
                "0 на любое число = 0");
        softAssert.assertEquals(ArithmeticOperations.division(21, 3), 7.0,
                "21 / 3 = 7");
        softAssert.assertEquals(ArithmeticOperations.division(-9, 1), -9.0,
                "-9 / 1 = -9");
        softAssert.assertAll();
    }

    @Test(description = "Деление на ноль", expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "На ноль делить нельзя")
    public void testDivisionByZero() {
        ArithmeticOperations.division(56, 0);
    }
}
