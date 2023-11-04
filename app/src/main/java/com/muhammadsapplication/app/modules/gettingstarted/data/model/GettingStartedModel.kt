package com.muhammadsapplication.app.modules.gettingstarted.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GettingStartedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTosetupyour: String? = MyApp.getInstance().resources.getString(R.string.msg_to_set_up_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerificationEn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_verification_en)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPreference: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_preference)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
