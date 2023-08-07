package com.vazidsapplication.app.modules.verfiyphone.`data`.model

import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerfiyPhoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifyPhone: String? = MyApp.getInstance().resources.getString(R.string.lbl_verify_phone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodeissentto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_code_is_sent_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_receive)

)
