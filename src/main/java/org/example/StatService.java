package org.example;

public class StatService {
    // Сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }

    // Средняя сумма всех продаж в месяц
    public long averageAmount(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maxSales(long[] sales) {
        int maxMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSales]) {
                maxMonthSales = i;
            }

        }
        maxMonthSales = maxMonthSales + 1;
        return maxMonthSales;
    }

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minSales(long[] sales) {
        int minMonthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSales]) {
                minMonthSales = i;
            }

        }
        minMonthSales = minMonthSales + 1;
        return minMonthSales;
    }

    //Количество месяцев, в которых продажи были ниже среднего
    public int salesBelowAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                numberOfMonth++;
            }

        }
        return numberOfMonth;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public int salesAboveAverage(long[] sales) {
        int numberOfMonth = 0;
        long averageSale = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                numberOfMonth++;
            }

        }
        return numberOfMonth;
    }
}
