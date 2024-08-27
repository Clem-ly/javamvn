package ru.netology.services.javamvn.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryServiceTest {

    @Test
    public void vacationСalculationTest() {
        SalaryService salaryService = new SalaryService();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        Assertions.assertEquals(income, expenses, threshold);

    }
}