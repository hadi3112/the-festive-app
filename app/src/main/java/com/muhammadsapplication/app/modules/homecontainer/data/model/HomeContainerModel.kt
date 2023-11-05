package com.muhammadsapplication.app.modules.homecontainer.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomecontainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplorelabelt: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaptextlabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_map)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilelabelt: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
