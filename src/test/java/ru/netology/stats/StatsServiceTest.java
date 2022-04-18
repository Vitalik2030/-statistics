package ru.netology.stats;

import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void calcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actyal = service.calcSum(sales);
        assertEcvals(expected, actyal);
    }

    private void assertEcvals(int expected, int actyal) {

    }


    @Test
    void SrednyayaSumma() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actyal = service.SrednyayaSumma(sales);
        assertEcvals(expected, actyal);
    }

    @Test
    void MinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actyal = service.MinSales(sales);
        assertEcvals(expected, actyal);
    }

    @Test
    void MaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actyal = service.MaxSales(sales);
        assertEcvals(expected, actyal);
    }

    @Test
    void BelowTheAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actyal = (int) service.BelowTheAverage(sales);
        assertEcvals(expected, actyal);
    }

    @Test
    void AboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actyal = (int) service.AboveAverage(sales);
        assertEcvals(expected, actyal);
    }
}









