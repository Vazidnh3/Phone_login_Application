package com.vazidsapplication.app.modules.secondphonenumber.`data`.model

import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SecondphonenumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLIVEASY: String? = MyApp.getInstance().resources.getString(R.string.lbl_liveasy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenteryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoullreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_ll_receive)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNinetyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_91)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)

)
