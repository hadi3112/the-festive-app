package com.muhammadsapplication.app.modules.homewithhamburgermenu.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomewithhamburgermenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfiletitlet: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_muhamamd_hadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfiletextvie: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookmarktextvi: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContacttextvie: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingstextvi: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelptextview: String? = MyApp.getInstance().resources.getString(R.string.lbl_helps_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignouttextvi: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)

)
