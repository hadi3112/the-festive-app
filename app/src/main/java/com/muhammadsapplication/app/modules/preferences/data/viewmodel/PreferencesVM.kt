package com.muhammadsapplication.app.modules.preferences.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.preferences.`data`.model.PreferencesModel
import org.koin.core.KoinComponent

class PreferencesVM : ViewModel(), KoinComponent {
  val preferencesModel: MutableLiveData<PreferencesModel> = MutableLiveData(PreferencesModel())

  var navArguments: Bundle? = null
}
