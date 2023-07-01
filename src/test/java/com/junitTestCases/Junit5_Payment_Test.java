package com.junitTestCases;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("regression")
public class Junit5_Payment_Test {
    @Tag("acceptance")
    @Tag("baseline")
    @Test // Junit 5 test
    void payment_success_test() {
        System.out.println("payment_success_test(): " + Thread.currentThread().getName());
    }
    @Tag("acceptance")
    @Test // Junit 5 test
    void payment_decline_test() {
        System.out.println("payment_decline_test(): " + Thread.currentThread().getName());
    }
    @Tag("security")
    @Test // Junit 5 test
    void invalid_country_test() {
        System.out.println("invalid_country_test(): " + Thread.currentThread().getName());
    }
}