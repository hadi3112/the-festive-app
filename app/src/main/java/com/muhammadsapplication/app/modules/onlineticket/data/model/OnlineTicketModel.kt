package com.muhammadsapplication.app.modules.onlineticket.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnlineTicketModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyQRCode: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilename: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaileySanders: String? = MyApp.getInstance().resources.getString(R.string.lbl_m_hadi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSimplyshowthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_simply_show_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoredetailsCo: String? = MyApp.getInstance().resources.getString(R.string.lbl_more_details)

)
