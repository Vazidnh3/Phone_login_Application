package com.vazidsapplication.app.modules.first.`data`.model

import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FirstModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLIVEASY: String? = MyApp.getInstance().resources.getString(R.string.lbl_liveasy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseselecty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_select_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanchange: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_change)

)
