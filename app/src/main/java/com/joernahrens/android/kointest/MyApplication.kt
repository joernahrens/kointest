package com.joernahrens.android.kointest

import android.app.Application
import com.joernahrens.android.kointest.ui.main.mainFragmentModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    startKoin {
      androidContext(this@MyApplication)

      modules(appModule, mainActivityModule, mainFragmentModule)
    }
  }
}
