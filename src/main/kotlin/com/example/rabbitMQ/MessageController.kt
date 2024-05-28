package com.example.rabbitMQ

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.TimeUnit

@RestController
class MessageController(
    private val messageSenderService: MessageSenderService
) {

    @PostMapping("/api")
    fun delay(@RequestBody message: String): String {
        TimeUnit.SECONDS.sleep(1) // 로직이 1초 걸림
        println("done = $message")
        return "ok"
    }

    @PostMapping("/rabbit")
    fun sendMessage(@RequestBody message: String): String {
        messageSenderService.sendMessage(message)
        println("커밋 3")
        return "ok"
    }
}