package com.joernahrens.android.kointest

import org.koin.dsl.module

val mainActivityModule = module {
  scope<MainActivity> {
    scoped { "" }
    scoped { SomeActivityRelatedClass(activity = get()) }
  }
}

val appModule = module {

}
