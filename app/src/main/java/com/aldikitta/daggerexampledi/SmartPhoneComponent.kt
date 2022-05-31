package com.aldikitta.daggerexampledi

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
sealed interface SmartPhoneComponent{
    fun inject(mainActivity: MainActivity)
}