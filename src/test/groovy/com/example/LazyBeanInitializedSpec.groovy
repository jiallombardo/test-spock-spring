package com.example

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
class LazyBeanInitializedSpec extends Specification {

    def 'no checks test'() {
        when:
            def a = 1 + 2

        then:
            a == 3
    }
}
