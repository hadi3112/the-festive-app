package com.muhammadsapplication.app.modules.onlineticket.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.onlineticket.`data`.model.OnlineTicketModel
import org.koin.core.KoinComponent

class OnlineTicketVM : ViewModel(), KoinComponent {
  val onlineTicketModel: MutableLiveData<OnlineTicketModel> = MutableLiveData(OnlineTicketModel())

  var navArguments: Bundle? = null
}
