package hu.zsoki.cinegrow.ui.cinegrow.ui.web

import hu.zsoki.cinegrow.ui.cinegrow.ui.service.SampleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SampleController(
    @Autowired val sampleService: SampleService
) {

    @GetMapping("/")
    @ResponseBody
    fun helloWorld(): String {
        return this.sampleService.getHelloMessage()
    }

}