package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    void moreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void lessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;

        int actual = service.remain(amount);
        int expected = 50;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void equalsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}
