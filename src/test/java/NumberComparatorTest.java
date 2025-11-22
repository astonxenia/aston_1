import org.example.LessonSeven.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    public void testNumbersEqual() {
        Assert.assertEquals(NumberComparator.compare(5, 5), "Числа равны");
    }

    @Test
    public void testNumbersNotEqual() {
        Assert.assertEquals(NumberComparator.compare(5, 10), "Числа не равны");
    }

    @Test
    public void testNumbersNegativeAndZero() {
        Assert.assertEquals(NumberComparator.compare(-1, -1), "Числа равны");
        Assert.assertEquals(NumberComparator.compare(0, 0), "Числа равны");
        Assert.assertEquals(NumberComparator.compare(-1, 1), "Числа не равны");
    }
}
