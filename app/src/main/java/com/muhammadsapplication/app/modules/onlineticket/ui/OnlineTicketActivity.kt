package com.muhammadsapplication.app.modules.onlineticket.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityOnlineTicketBinding
import com.muhammadsapplication.app.modules.onlineticket.`data`.viewmodel.OnlineTicketVM
import kotlin.String
import kotlin.Unit

class OnlineTicketActivity :
    BaseActivity<ActivityOnlineTicketBinding>(R.layout.activity_online_ticket) {
  private val viewModel: OnlineTicketVM by viewModels<OnlineTicketVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onlineTicketVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONLINE_TICKET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnlineTicketActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
