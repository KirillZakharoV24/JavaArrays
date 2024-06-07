import org.example.StatService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void testSumSales() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = statService.sumSales(arr);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testAverageAmount() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = statService.averageAmount(arr);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMaxSales() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = statService.maxSales(arr);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testMinSales() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = statService.minSales(arr);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSalesBelowAverage() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = statService.salesBelowAverage(arr);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSalesAboveAverage() {
        StatService statService = new StatService();
        long [] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = statService.salesAboveAverage(arr);
        Assertions.assertEquals(expected,actual);
    }
}
