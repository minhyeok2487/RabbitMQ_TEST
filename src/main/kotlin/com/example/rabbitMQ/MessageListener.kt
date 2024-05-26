package com.example.rabbitMQ

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit

@Component
class MessageListener {

    @RabbitListener(queues = ["test-queue"])
    fun receiveMessage(message: String) {
        TimeUnit.SECONDS.sleep(1) // 로직이 1초 걸림
        println("done = $message")
    }
}