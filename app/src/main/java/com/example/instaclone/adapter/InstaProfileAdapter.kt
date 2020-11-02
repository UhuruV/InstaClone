package com.example.instaclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.R
import com.example.instaclone.dataclasses.Highlights
import kotlinx.android.synthetic.main.profile_highlight_items.view.*


class InstaProfileAdapter(val instaHighlightList:List<Highlights>):RecyclerView.Adapter<InstaProfileAdapter.InstaProfileViewHolder>() {

    class InstaProfileViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaProfileViewHolder {
        val rowView=LayoutInflater.from(parent.context).inflate(R.layout.profile_row_list_item,parent,false)
        return InstaProfileViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: InstaProfileViewHolder, position: Int) {
        val profile=instaHighlightList.get(position)
        holder.itemView.tvHighlights.text=profile.highlightTitle
        Glide
            .with(holder.itemView.context)
            .load(profile.highlightUrl)
            .placeholder(R.drawable.ic_profile_pic)
            .circleCrop()
            .into(holder.itemView.ivHighlights)
    }

    override fun getItemCount(): Int {
        return instaHighlightList.size
    }
}