package com.vazidsapplication.app.modules.first.ui

import androidx.activity.viewModels
import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.base.BaseActivity
import com.vazidsapplication.app.databinding.ActivityFirstBinding
import com.vazidsapplication.app.modules.first.`data`.model.SpinnerLanguageModel
import com.vazidsapplication.app.modules.first.`data`.viewmodel.FirstVM
import com.vazidsapplication.app.modules.secondphonenumber.ui.SecondphonenumberActivity
import kotlin.String
import kotlin.Unit

class FirstActivity : BaseActivity<ActivityFirstBinding>(R.layout.activity_first) {
  private val viewModel: FirstVM by viewModels<FirstVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageList.value = mutableListOf(
    SpinnerLanguageModel("Item1"),
    SpinnerLanguageModel("Item2"),
    SpinnerLanguageModel("Item3"),
    SpinnerLanguageModel("Item4"),
    SpinnerLanguageModel("Item5")
    )
    val spinnerLanguageAdapter =
    SpinnerLanguageAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageList.value?:
    mutableListOf())
    binding.spinnerLanguage.adapter = spinnerLanguageAdapter
    binding.firstVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = SecondphonenumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FIRST_ACTIVITY"

  }
}
