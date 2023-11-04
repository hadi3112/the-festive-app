package com.muhammadsapplication.app.modules.paymentportal.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadsapplication.app.R
import com.muhammadsapplication.app.databinding.RowPaymentPortalBinding
import com.muhammadsapplication.app.modules.paymentportal.`data`.model.PaymentPortalRowModel
import kotlin.Int
import kotlin.collections.List

class PaymentPortalAdapter(
  var list: List<PaymentPortalRowModel>
) : RecyclerView.Adapter<PaymentPortalAdapter.RowPaymentPortalVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentPortalVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment_portal,parent,false)
    return RowPaymentPortalVH(view)
  }

  override fun onBindViewHolder(holder: RowPaymentPortalVH, position: Int) {
    val paymentPortalRowModel = PaymentPortalRowModel()
    // TODO uncomment following line after integration with data source
    // val paymentPortalRowModel = list[position]
    holder.binding.paymentPortalRowModel = paymentPortalRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PaymentPortalRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PaymentPortalRowModel
    ) {
    }
  }

  inner class RowPaymentPortalVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPaymentPortalBinding = RowPaymentPortalBinding.bind(itemView)
  }
}
