package hu.zsoki.cinegrow.ui.cinegrow.ui.service


import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SampleService(
    @Value("\${name:World}") private val name: String
) {

    fun getHelloMessage() = "Hello " + this.name

}