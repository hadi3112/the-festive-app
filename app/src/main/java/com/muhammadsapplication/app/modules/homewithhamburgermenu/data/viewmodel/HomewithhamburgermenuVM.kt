package com.muhammadsapplication.app.modules.homewithhamburgermenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homewithhamburgermenu.`data`.model.HomewithhamburgermenuModel
import org.koin.core.KoinComponent

class HomewithhamburgermenuVM : ViewModel(), KoinComponent {
  val homewithhamburgermenuModel: MutableLiveData<HomewithhamburgermenuModel> =
      MutableLiveData(HomewithhamburgermenuModel())

  var navArguments: Bundle? = null
}
