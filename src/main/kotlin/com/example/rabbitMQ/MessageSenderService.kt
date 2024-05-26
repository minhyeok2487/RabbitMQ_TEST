package com.example.rabbitMQ

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class MessageSenderService(
    private val rabbitTemplate: RabbitTemplate
) {

    fun sendMessage(message: String) {
        rabbitTemplate.convertAndSend("test-exchange", "test-routing-key", message)
    }
}