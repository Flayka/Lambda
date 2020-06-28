package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldReturn10IfAmountIs2000() {
        BonusService service = new BonusService();
        int amount = 20000;

        int actual = service.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);
    }
}