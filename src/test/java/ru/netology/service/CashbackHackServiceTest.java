package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void moreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void lessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 950;

        int actual = service.remain(amount);
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void equalsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}




