package com.example

import org.springframework.boot.SpringApplication
import spock.lang.Specification

class LazyBeanNotInitializedSpec extends Specification {

    def appcontext

    def setup() {
        appcontext = SpringApplication.run(Application)
    }

    def 'test2'() {
        expect:
            appcontext
    }
}
