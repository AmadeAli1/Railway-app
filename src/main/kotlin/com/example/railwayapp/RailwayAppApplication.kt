package com.example.railwayapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class RailwayAppApplication

fun main(args: Array<String>) {
    runApplication<RailwayAppApplication>(*args)
}

@RestController
@RequestMapping("/api")
class RailwayController(private val environment: Environment) {

    @GetMapping()
    fun all(): List<String> {
        val env = environment["google"]
        return listOf("Amade", "Vasco", "Ali", "Google: $env")
    }

}
