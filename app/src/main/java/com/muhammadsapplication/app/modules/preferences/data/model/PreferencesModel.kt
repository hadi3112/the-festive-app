package com.muhammadsapplication.app.modules.preferences.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PreferencesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_personali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggested: String? = MyApp.getInstance().resources.getString(R.string.lbl_suggested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompetitons: String? = MyApp.getInstance().resources.getString(R.string.lbl_competitons)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCoding: String? = MyApp.getInstance().resources.getString(R.string.lbl_coding)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUniversity: String? = MyApp.getInstance().resources.getString(R.string.lbl_university)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConferences: String? = MyApp.getInstance().resources.getString(R.string.lbl_conferences)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTravel: String? = MyApp.getInstance().resources.getString(R.string.lbl_travel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup33330Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSuggestionGrouValue: String? = null
)
