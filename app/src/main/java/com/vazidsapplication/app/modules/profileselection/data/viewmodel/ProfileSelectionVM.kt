package com.vazidsapplication.app.modules.profileselection.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vazidsapplication.app.modules.profileselection.`data`.model.ListellipseoneRowModel
import com.vazidsapplication.app.modules.profileselection.`data`.model.ProfileSelectionModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileSelectionVM : ViewModel(), KoinComponent {
  val profileSelectionModel: MutableLiveData<ProfileSelectionModel> =
      MutableLiveData(ProfileSelectionModel())

  var navArguments: Bundle? = null

  val listellipseoneList: MutableLiveData<MutableList<ListellipseoneRowModel>> =
      MutableLiveData(mutableListOf())
}
