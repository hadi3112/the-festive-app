package com.muhammadsapplication.app.modules.paymentportal.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentPortalRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoanDisburseme: String? =
      MyApp.getInstance().resources.getString(R.string.msg_loan_disburseme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_2022_09_12)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_050_00)

)
