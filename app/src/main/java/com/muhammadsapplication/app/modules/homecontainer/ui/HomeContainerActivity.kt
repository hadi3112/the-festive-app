package com.muhammadsapplication.app.modules.homecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityHomecontainerBinding
import com.muhammadsapplication.app.extensions.loadFragment
import com.muhammadsapplication.app.modules.home.ui.HomeFragment
import com.muhammadsapplication.app.modules.homecontainer.`data`.viewmodel.HomecontainerVM
import kotlin.String
import kotlin.Unit

class HomecontainerActivity :
    BaseActivity<ActivityHomecontainerBinding>(R.layout.activity_homecontainer) {
  private val viewModel: HomecontainerVM by viewModels<HomecontainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homecontainerVM = viewModel
    val destFragment = HomeFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomeFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearExploreTab.setOnClickListener {
      val destFragment = HomeFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomeFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOMECONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomecontainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
