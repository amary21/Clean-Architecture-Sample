package com.amary.cleanarchsample.data

import com.amary.cleanarchsample.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}