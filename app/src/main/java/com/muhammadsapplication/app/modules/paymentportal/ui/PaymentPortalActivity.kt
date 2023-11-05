package com.muhammadsapplication.app.modules.paymentportal.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.base.BaseActivity
import com.muhammadsapplication.app.databinding.ActivityPaymentPortalBinding
import com.muhammadsapplication.app.modules.onlineticketactivity.ui.OnlineticketactivityDialog
import com.muhammadsapplication.app.modules.paymentportal.`data`.model.PaymentPortalRowModel
import com.muhammadsapplication.app.modules.paymentportal.`data`.viewmodel.PaymentPortalVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentPortalActivity :
    BaseActivity<ActivityPaymentPortalBinding>(R.layout.activity_payment_portal) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: PaymentPortalVM by viewModels<PaymentPortalVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val paymentPortalAdapter =
      PaymentPortalAdapter(viewModel.paymentPortalList.value?:mutableListOf())
      binding.recyclerPaymentPortal.adapter = paymentPortalAdapter
      paymentPortalAdapter.setOnItemClickListener(
      object : PaymentPortalAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : PaymentPortalRowModel) {
          onClickRecyclerPaymentPortal(view, position, item)
        }
      }
      )
      viewModel.paymentPortalList.observe(this) {
        paymentPortalAdapter.updateData(it)
      }
      binding.paymentPortalVM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.btnConfirm.setOnClickListener {
        val destFragment = OnlineticketactivityDialog.getInstance(null)
        destFragment.show(this.supportFragmentManager, OnlineticketactivityDialog.TAG)
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{6}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    fun onClickRecyclerPaymentPortal(
      view: View,
      position: Int,
      item: PaymentPortalRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "PAYMENT_PORTAL_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, PaymentPortalActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
