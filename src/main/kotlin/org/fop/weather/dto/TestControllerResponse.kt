package org.fop.weather.dto

data class TestControllerResponse(
    val msg: String = "Hello from Weather Service",
    val ip: String,
    val weather: String = "The weather is fine"
)
