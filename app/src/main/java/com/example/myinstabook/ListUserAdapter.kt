package com.example.myinstabook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListUserAdapter(private val listUser: List<String>) : RecyclerView.Adapter<ListUserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_user, viewGroup, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvItem.text = listUser[position]

    }
    override fun getItemCount(): Int {
        return listUser.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
//        ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_user, viewGroup, false))
//    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
//        viewHolder.tvItem.text = listReview[position]
//    }
//    override fun getItemCount() = listReview.size
//    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        val tvItem: TextView = view.findViewById(R.id.tv_item_name)
//    }
}