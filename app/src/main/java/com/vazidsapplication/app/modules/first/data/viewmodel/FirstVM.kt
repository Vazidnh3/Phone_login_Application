package com.vazidsapplication.app.modules.first.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vazidsapplication.app.modules.first.`data`.model.FirstModel
import com.vazidsapplication.app.modules.first.`data`.model.SpinnerLanguageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FirstVM : ViewModel(), KoinComponent {
  val firstModel: MutableLiveData<FirstModel> = MutableLiveData(FirstModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()
}
