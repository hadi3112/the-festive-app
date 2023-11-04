package com.muhammadsapplication.app.modules.specificitem.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SpecificItemModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPageTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_tastefest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAction: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRs1500perso: String? = MyApp.getInstance().resources.getString(R.string.msg_rs_1500_perso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVipPass: String? = MyApp.getInstance().resources.getString(R.string.lbl_vip_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIslamabad: String? = MyApp.getInstance().resources.getString(R.string.lbl_islamabad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt7thMar2023: String? = MyApp.getInstance().resources.getString(R.string.lbl_7th_mar_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_get_excited_ta)

)
