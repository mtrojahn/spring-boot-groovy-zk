package com.mtrojahn.boot

import org.springframework.stereotype.Component

@Component
class SimpleBean {

    static def echo(message) {
        message
    }
}
