package com.onix.internship

import android.app.Application
import com.onix.internship.di.dataModule
import com.onix.internship.di.providerModule
import com.onix.internship.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class InternshipApp : Application() {

    private val appModules by lazy {
        listOf(viewModelModule, providerModule, dataModule)
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@InternshipApp)
            modules(appModules)
        }
    }

}