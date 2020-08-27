package com.amary.cleanarchsample.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}