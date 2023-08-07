package com.vazidsapplication.app.modules.profileselection.`data`.model

import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileSelectionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseselecty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_select_y2)

)
