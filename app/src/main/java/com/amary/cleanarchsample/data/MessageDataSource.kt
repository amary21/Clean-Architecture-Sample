package com.amary.cleanarchsample.data

import com.amary.cleanarchsample.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name Welcome to Clean Architecture")
}