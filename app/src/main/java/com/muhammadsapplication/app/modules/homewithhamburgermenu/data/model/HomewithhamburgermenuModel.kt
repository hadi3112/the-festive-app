package com.muhammadsapplication.app.modules.homewithhamburgermenu.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomewithhamburgermenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMuhamamdHadi: String? = MyApp.getInstance().resources.getString(R.string.lbl_muhamamd_hadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookmarkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpsFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_helps_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)

)
