package com.amary.cleanarchsample.di

import com.amary.cleanarchsample.data.IMessageDataSource
import com.amary.cleanarchsample.data.MessageDataSource
import com.amary.cleanarchsample.data.MessageRepository
import com.amary.cleanarchsample.domain.IMessageRepository
import com.amary.cleanarchsample.domain.MessageInteractor
import com.amary.cleanarchsample.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}