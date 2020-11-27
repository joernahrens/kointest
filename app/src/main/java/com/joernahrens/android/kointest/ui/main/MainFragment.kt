package com.joernahrens.android.kointest.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joernahrens.android.kointest.R
import org.koin.androidx.scope.ScopeFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : ScopeFragment() {

  private val viewModel: MainViewModel by viewModel()
  private val text: String by inject()
  private val someUiRelatedClass: SomeUiRelatedClass by inject()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }


  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    Log.d(TAG, text)
    Log.d(TAG, someUiRelatedClass.foo())
    Log.d(TAG, System.identityHashCode(someUiRelatedClass).toString())
  }

  companion object {
    fun newInstance() = MainFragment()
    const val TAG = "MainFragment"

  }
}
