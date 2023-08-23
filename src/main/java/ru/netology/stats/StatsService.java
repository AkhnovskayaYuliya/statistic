package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {
        return sumSales(sales) / 12;
    }

    public int peakSales(int[] sales) {
        int peakSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[peakSales]) {
                peakSales = i;
            }
        }
        return peakSales + 1;
    }

    public int minSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    public int belowAverage(int[] sales) {
        int month = 0;
        int averageSale = averageSumSales(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                month++;
            }
        }
        return month;
    }


    public int aboveAverage(int[] sales) {
        int month = 0;
        int averageSale = averageSumSales(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                month++;
            }
        }
        return month;
    }


}
