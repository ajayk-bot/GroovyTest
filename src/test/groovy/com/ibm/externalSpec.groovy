package com.ibm

import spock.lang.Specification

class externalSpec extends Specification {
    def "an integer can be incremented"() {
        given:
        int i = 1
        when:
        i++
        then:
        println("validation the integer output here:")
        i == 2
    }


}
