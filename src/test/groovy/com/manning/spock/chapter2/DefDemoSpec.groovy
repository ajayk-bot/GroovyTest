package com.manning.spock.chapter2


import spock.lang.Specification

class DefDemoSpec extends Specification {

    //can able to write traditional java
    public void trival_sum() {
        when: "number is one"
        int num = 1;
        then: "adding a number 1 become 2"
        num + num == 2;

    }

    def void trival_multi() {
        given: "Two multiple number have been given"
        def num1 = 1
        def num2 = 2
        when: "multiply the number"
        def ans = num1 * num2
        then: "validate the answer to 2"
        ans == 2
    }


    def void trival_division() {
        given: "number are given to divide"
        int num1 = 4
        def num2 = 4
        when: "divide the numbers"
        def answer = num1 / num2
        then: "check the answer to 1"
        answer == 1

    }

}
