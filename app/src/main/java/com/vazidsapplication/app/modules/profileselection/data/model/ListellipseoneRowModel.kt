package com.vazidsapplication.app.modules.profileselection.`data`.model

import com.vazidsapplication.app.R
import com.vazidsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseoneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShipper: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
