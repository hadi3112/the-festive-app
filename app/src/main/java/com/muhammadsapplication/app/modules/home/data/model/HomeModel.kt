package com.muhammadsapplication.app.modules.home.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLocationtext: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lahore_pakista)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchhint: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterlabelte: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUpcomingEvents: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_upcoming_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArmanrokni: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? = MyApp.getInstance().resources.getString(R.string.lbl_tastefest_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt200Going: String? = MyApp.getInstance().resources.getString(R.string.lbl_200_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_food_street_fe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt21Oct: String? = MyApp.getInstance().resources.getString(R.string.lbl_21_oct)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_conference)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt400Going: String? = MyApp.getInstance().resources.getString(R.string.lbl_400_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24min: String? = MyApp.getInstance().resources.getString(R.string.msg_fortress_square)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInvitefriends: String? =
      MyApp.getInstance().resources.getString(R.string.msg_invite_your_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscounttext: String? =
      MyApp.getInstance().resources.getString(R.string.msg_get_rs_1500_off)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearby_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllCopyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)

)
