package com.junitTestCases;

import org.junit.jupiter.api.Test;

public class Junit4_Surcharge_Test {

    @Test
    public void surcharge_merchant_test() {

        System.out.println("surcharge_merchant_test(): " + Thread.currentThread().getName());
    }

    @Test
    public void surcharge_byCountry_test() {
        System.out.println("surcharge_byCountry_test(): " + Thread.currentThread().getName());
    }

    @Test
    public void surcharge_formula_test() {
        System.out.println("surcharge_formula_test(): " + Thread.currentThread().getName());
    }
}