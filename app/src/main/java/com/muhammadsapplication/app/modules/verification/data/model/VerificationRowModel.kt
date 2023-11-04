package com.muhammadsapplication.app.modules.verification.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtABCTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ghi)

)
