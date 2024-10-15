package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void remainTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void remainTestWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void remainTestCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2200;
        int actual = service.remain(amount);
        int expected = 800;
        Assert.assertEquals(expected,actual);
    }
  
}