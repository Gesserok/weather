package org.fop.weather.controllers

import org.fop.weather.dto.TestControllerResponse
import org.fop.weather.services.TestService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val testService: TestService
) {

    @GetMapping("/", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun test(): ResponseEntity<TestControllerResponse> {
        return ResponseEntity.ok().body(
            TestControllerResponse(
                ip = testService.getIp()
            )
        )
    }
}
