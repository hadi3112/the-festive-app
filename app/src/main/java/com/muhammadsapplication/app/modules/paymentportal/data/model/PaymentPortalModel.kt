package com.muhammadsapplication.app.modules.paymentportal.`data`.model

import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentPortalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodafternoon: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_good_afternoon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJacquie: String? = MyApp.getInstance().resources.getString(R.string.lbl_jacquie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoanBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_loan_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_3_000_00_of_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_39_days_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepayLoan: String? = MyApp.getInstance().resources.getString(R.string.lbl_repay_loan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactions: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMiniStatement: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mini_statement)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentPortal: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_portal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyitNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_it_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReservation: String? = MyApp.getInstance().resources.getString(R.string.lbl_reservation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewsTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_book_your_spot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucurrentlyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_currently_o)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_rs_1500_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerification: String? = MyApp.getInstance().resources.getString(R.string.lbl_verification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntercodesent: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_code_sent)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_resend_code)

)
