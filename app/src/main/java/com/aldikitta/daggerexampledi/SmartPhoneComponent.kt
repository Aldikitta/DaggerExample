package com.aldikitta.daggerexampledi

import dagger.Component

@Component(modules = [MemoryCardModule::class, NCBatteryModule::class])
sealed interface SmartPhoneComponent{
    fun inject(mainActivity: MainActivity)
}