package com.wanzz.pgrcharwiki

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val listChar: ArrayList<CharModel>) : RecyclerView.Adapter<MainAdapter.ListViewHolder>() {
    private lateinit var mListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView.findViewById(R.id.tv_name)
        var role: TextView = itemView.findViewById(R.id.tv_class)
        var imgProfile: ImageView = itemView.findViewById(R.id.img_profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_main, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val itemChar = listChar[position]
        holder.name.text = itemChar.name
        holder.role.text = itemChar.role
        holder.imgProfile.setImageResource(itemChar.profile)
        holder.itemView.setOnClickListener {
            mListener.onItemClick(position)
        }
    }
}