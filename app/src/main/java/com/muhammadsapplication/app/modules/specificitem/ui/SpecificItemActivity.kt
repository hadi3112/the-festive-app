package com.muhammadsapplication.app.modules.specificitem.ui

import androidx.activity.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivitySpecificItemBinding
import com.muhammadsapplication.app.modules.homecontainer.ui.HomeContainerActivity
import com.muhammadsapplication.app.modules.paymentportal.ui.PaymentPortalActivity
import com.muhammadsapplication.app.modules.specificitem.`data`.model.ImageSliderSlidergroupfourModel
import com.muhammadsapplication.app.modules.specificitem.`data`.viewmodel.SpecificItemVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class SpecificItemActivity :
    BaseActivity<ActivitySpecificItemBinding>(R.layout.activity_specific_item) {
  private val imageSliderSlidergroupfourItems: ArrayList<ImageSliderSlidergroupfourModel> =
      arrayListOf()


  private val viewModel: SpecificItemVM by viewModels<SpecificItemVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidergroupfourAdapter = SlidergroupfourAdapter(imageSliderSlidergroupfourItems,true)
    binding.imageSliderSlidergroupfour.adapter = slidergroupfourAdapter
    binding.imageSliderSlidergroupfour.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorFrame330.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorFrame330.updateIndicatorCounts(binding.imageSliderSlidergroupfour.indicatorCount)
    binding.specificItemVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidergroupfour.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidergroupfour.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnGetPasses.setOnClickListener {
      val destIntent = PaymentPortalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(this, null)
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
