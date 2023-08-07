package com.vazidsapplication.app.modules.secondphonenumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vazidsapplication.app.modules.secondphonenumber.`data`.model.SecondphonenumberModel
import org.koin.core.KoinComponent

class SecondphonenumberVM : ViewModel(), KoinComponent {
  val secondphonenumberModel: MutableLiveData<SecondphonenumberModel> =
      MutableLiveData(SecondphonenumberModel())

  var navArguments: Bundle? = null
}
