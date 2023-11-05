package com.muhammadsapplication.app.modules.homecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.homecontainer.`data`.model.HomecontainerModel
import org.koin.core.KoinComponent

class HomecontainerVM : ViewModel(), KoinComponent {
  val homecontainerModel: MutableLiveData<HomecontainerModel> =
      MutableLiveData(HomecontainerModel())

  var navArguments: Bundle? = null
}
