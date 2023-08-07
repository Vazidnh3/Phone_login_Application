package com.vazidsapplication.app.modules.secondphonenumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.base.BaseActivity
import com.vazidsapplication.app.databinding.ActivitySecondphonenumberBinding
import com.vazidsapplication.app.modules.secondphonenumber.`data`.viewmodel.SecondphonenumberVM
import kotlin.String
import kotlin.Unit

class SecondphonenumberActivity :
    BaseActivity<ActivitySecondphonenumberBinding>(R.layout.activity_secondphonenumber) {
  private val viewModel: SecondphonenumberVM by viewModels<SecondphonenumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.secondphonenumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      // TODO please, add your navigation code here
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SECONDPHONENUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SecondphonenumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
