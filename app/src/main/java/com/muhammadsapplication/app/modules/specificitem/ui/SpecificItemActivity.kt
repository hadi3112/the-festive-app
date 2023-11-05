package com.muhammadsapplication.app.modules.specificitem.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivitySpecificItemBinding
import com.muhammadsapplication.app.modules.homecontainer.ui.HomecontainerActivity
import com.muhammadsapplication.app.modules.paymentportal.ui.PaymentPortalActivity
import com.muhammadsapplication.app.modules.specificitem.`data`.model.ImageSliderSlidergrouponeModel
import com.muhammadsapplication.app.modules.specificitem.`data`.viewmodel.SpecificItemVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class SpecificItemActivity :
    BaseActivity<ActivitySpecificItemBinding>(R.layout.activity_specific_item) {
  private val imageSliderSlidergrouponeItems: ArrayList<ImageSliderSlidergrouponeModel> =
      arrayListOf()


  private val viewModel: SpecificItemVM by viewModels<SpecificItemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidergrouponeAdapter = SlidergrouponeAdapter(imageSliderSlidergrouponeItems,true)
    binding.imageSliderSlidergroupone.adapter = slidergrouponeAdapter
    binding.imageSliderSlidergroupone.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorFrame330.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorFrame330.updateIndicatorCounts(binding.imageSliderSlidergroupone.indicatorCount)
    binding.specificItemVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidergroupone.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidergroupone.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = HomecontainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnGetPasses.setOnClickListener {
      val destIntent = PaymentPortalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumngetPasses.setOnClickListener {
      val destIntent = PaymentPortalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPECIFIC_ITEM_ACTIVITY"

  }
}
