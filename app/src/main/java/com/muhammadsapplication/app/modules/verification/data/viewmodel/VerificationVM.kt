package com.muhammadsapplication.app.modules.verification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.muhammadsapplication.app.modules.verification.`data`.model.VerificationModel
import com.muhammadsapplication.app.modules.verification.`data`.model.VerificationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class VerificationVM : ViewModel(), KoinComponent {
  val verificationModel: MutableLiveData<VerificationModel> = MutableLiveData(VerificationModel())

  var navArguments: Bundle? = null

  val verificationList: MutableLiveData<MutableList<VerificationRowModel>> =
      MutableLiveData(mutableListOf())
}
