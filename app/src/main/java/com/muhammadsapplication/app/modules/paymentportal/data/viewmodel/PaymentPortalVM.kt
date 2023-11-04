package com.muhammadsapplication.app.modules.paymentportal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.paymentportal.`data`.model.PaymentPortalModel
import com.muhammadsapplication.app.modules.paymentportal.`data`.model.PaymentPortalRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentPortalVM : ViewModel(), KoinComponent {
  val paymentPortalModel: MutableLiveData<PaymentPortalModel> =
      MutableLiveData(PaymentPortalModel())

  var navArguments: Bundle? = null

  val paymentPortalList: MutableLiveData<MutableList<PaymentPortalRowModel>> =
      MutableLiveData(mutableListOf())
}
