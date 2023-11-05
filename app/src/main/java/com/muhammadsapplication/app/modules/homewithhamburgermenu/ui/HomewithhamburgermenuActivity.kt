package com.muhammadsapplication.app.modules.homewithhamburgermenu.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityHomewithhamburgermenuBinding
import com.muhammadsapplication.app.modules.homecontainer.ui.HomecontainerActivity
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
    binding.imageThehomeinbac.setOnClickListener {
      val destIntent = HomecontainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOMEWITHHAMBURGERMENU_ACTIVITY"

  }
}
