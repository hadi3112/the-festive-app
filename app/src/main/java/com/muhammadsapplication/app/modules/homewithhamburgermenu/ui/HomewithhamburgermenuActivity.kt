package com.muhammadsapplication.app.modules.homewithhamburgermenu.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityHomewithhamburgermenuBinding
import com.muhammadsapplication.app.modules.homecontainer.ui.HomeContainerActivity
import com.muhammadsapplication.app.modules.homewithhamburgermenu.`data`.viewmodel.HomewithhamburgermenuVM
import kotlin.String
import kotlin.Unit

class HomewithhamburgermenuActivity :
    BaseActivity<ActivityHomewithhamburgermenuBinding>(R.layout.activity_homewithhamburgermenu) {
  private val viewModel: HomewithhamburgermenuVM by viewModels<HomewithhamburgermenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homewithhamburgermenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImageNinetyFour.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOMEWITHHAMBURGERMENU_ACTIVITY"

  }
}
