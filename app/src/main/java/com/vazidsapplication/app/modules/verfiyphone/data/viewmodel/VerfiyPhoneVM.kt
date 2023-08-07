package com.vazidsapplication.app.modules.verfiyphone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vazidsapplication.app.modules.verfiyphone.`data`.model.VerfiyPhoneModel
import org.koin.core.KoinComponent

class VerfiyPhoneVM : ViewModel(), KoinComponent {
  val verfiyPhoneModel: MutableLiveData<VerfiyPhoneModel> = MutableLiveData(VerfiyPhoneModel())

  var navArguments: Bundle? = null
}
