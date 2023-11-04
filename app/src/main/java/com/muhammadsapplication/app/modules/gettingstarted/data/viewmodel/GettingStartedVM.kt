package com.muhammadsapplication.app.modules.gettingstarted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.gettingstarted.`data`.model.GettingStartedModel
import org.koin.core.KoinComponent

class GettingStartedVM : ViewModel(), KoinComponent {
  val gettingStartedModel: MutableLiveData<GettingStartedModel> =
      MutableLiveData(GettingStartedModel())

  var navArguments: Bundle? = null
}
