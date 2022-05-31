package com.aldikitta.daggerexampledi

import dagger.Component

@Component(modules = [MemoryCardModule::class])
sealed interface SmartPhoneComponent{
    fun getSmartPhone(): SmartPhone
}