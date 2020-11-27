package com.joernahrens.android.kointest.ui.main

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainFragmentModule = module {
  scope<MainFragment> {
    viewModel { MainViewModel() }
    scoped { "foobar" }
    scoped { SomeUiRelatedClass(mainFragment = get()) }
  }
}
