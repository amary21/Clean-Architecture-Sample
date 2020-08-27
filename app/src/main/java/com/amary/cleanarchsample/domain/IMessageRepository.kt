package com.amary.cleanarchsample.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}