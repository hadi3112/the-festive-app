package com.muhammadsapplication.app.modules.home.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseFragment
import com.muhammadsapplication.app.databinding.FragmentHomeBinding
import com.muhammadsapplication.app.modules.home.`data`.model.SpinnerCurrentlocatioModel
import com.muhammadsapplication.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerCurrentlocatioList.value = mutableListOf(
    SpinnerCurrentlocatioModel("Item1"),
    SpinnerCurrentlocatioModel("Item2"),
    SpinnerCurrentlocatioModel("Item3"),
    SpinnerCurrentlocatioModel("Item4"),
    SpinnerCurrentlocatioModel("Item5")
    )
    val spinnerCurrentlocatioAdapter =
    SpinnerCurrentlocatioAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerCurrentlocatioList.value?:
    mutableListOf())
    binding.spinnerCurrentlocatio.adapter = spinnerCurrentlocatioAdapter
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomeFragment {
      val fragment = HomeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
