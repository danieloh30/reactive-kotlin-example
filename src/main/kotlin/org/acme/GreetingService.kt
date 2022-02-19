package org.acme

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greeting(name: String): String {
        return "Welcome Kotlin in Quarkus, $name"
    }

}