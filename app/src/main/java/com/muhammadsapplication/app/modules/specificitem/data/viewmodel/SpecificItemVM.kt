package com.muhammadsapplication.app.modules.specificitem.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.specificitem.`data`.model.SpecificItemModel
import org.koin.core.KoinComponent

class SpecificItemVM : ViewModel(), KoinComponent {
  val specificItemModel: MutableLiveData<SpecificItemModel> = MutableLiveData(SpecificItemModel())

  var navArguments: Bundle? = null
}
