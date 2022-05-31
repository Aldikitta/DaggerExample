package com.aldikitta.daggerexampledi

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {
    @Provides
    fun providesMemoryCard(): MemoryCard {
        return MemoryCard()
    }
}