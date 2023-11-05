package com.muhammadsapplication.app.modules.verification.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeGetsta: String? = MyApp.getInstance().resources.getString(R.string.lbl_verification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWevesendyou: String? = MyApp.getInstance().resources.getString(R.string.msg_we_ve_send_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_re_send_code_in)

)
