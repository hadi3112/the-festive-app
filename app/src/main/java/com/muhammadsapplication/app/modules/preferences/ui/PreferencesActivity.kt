package com.muhammadsapplication.app.modules.preferences.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityPreferencesBinding
import com.muhammadsapplication.app.modules.preferences.`data`.viewmodel.PreferencesVM
import com.muhammadsapplication.app.modules.verification.ui.VerificationActivity
import kotlin.String
import kotlin.Unit

class PreferencesActivity : BaseActivity<ActivityPreferencesBinding>(R.layout.activity_preferences)
    {
  private val viewModel: PreferencesVM by viewModels<PreferencesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.preferencesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.viewGroup18177.setOnClickListener {
      val destIntent = VerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PREFERENCES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PreferencesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
