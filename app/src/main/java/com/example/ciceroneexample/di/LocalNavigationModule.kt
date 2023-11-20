package com.example.ciceroneexample.di

import com.example.ciceroneexample.navigation.LocalCiceroneStorage
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object LocalNavigationModule {

    @Provides
    @Singleton
    fun provideLocalNavigationHolder(): LocalCiceroneStorage = LocalCiceroneStorage()
}
