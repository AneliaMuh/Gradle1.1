package ru.netology.service;

public class CashbackHackServiceTest  {
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remainTestWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        org.junit.Assert.assertEquals(expected, actual);
    }
    @org.junit.Test
    public void remainTestCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2200;
        int actual = service.remain(amount);
        int expected = 800;
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void remainTestWithCashback2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void remainTestCashback2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2200;
        int actual = service.remain(amount);
        int expected = 800;
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }


}