package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerTest {

    @Test
    public void NormalRestL() {
        CashBackHacker service = new CashBackHacker();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void NormalRestH() {
        CashBackHacker service = new CashBackHacker();
        int expected = 900;
        int amount = 1100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ZeroRest() {
        CashBackHacker service = new CashBackHacker();
        int expected = 0;
        int amount = 1000;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}