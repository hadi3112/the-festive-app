package com.muhammadsapplication.app.modules.specificitem.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.muhammadsapplication.app.databinding.SlideritemSpecificItem1Binding
import com.muhammadsapplication.app.modules.specificitem.`data`.model.ImageSliderSlidergroupfourModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidergroupfourAdapter(
  val dataList: ArrayList<ImageSliderSlidergroupfourModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidergroupfourModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemSpecificItem1Binding) {
      binding.imageSliderSlidergroupfourModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemSpecificItem1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
