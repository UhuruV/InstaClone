package com.example.instaclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.R
import com.example.instaclone.dataclasses.NewHighlight
import kotlinx.android.synthetic.main.profile_new_item.view.*

class NewHiglightAdapter (val newHighlight: List<NewHighlight>):RecyclerView.Adapter<NewHiglightAdapter.NewHighlightViewHolder>(){
    class NewHighlightViewHolder(val rowView:View):RecyclerView.ViewHolder(rowView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewHighlightViewHolder {
        val rowView=LayoutInflater.from(parent.context).inflate(R.layout.profile_new_item,parent,false)
        return NewHighlightViewHolder(
            rowView
        )
    }

    override fun getItemCount(): Int {
        return newHighlight.size
    }

    override fun onBindViewHolder(holder: NewHighlightViewHolder, position: Int) {
        val new=newHighlight.get(position)
        holder.rowView.tvNew.text=new.newName
        Glide
            .with(holder.rowView.context)
            .load(new.newAvatar)
            .circleCrop()
            .placeholder(R.drawable.ic_new_highlight)
            .into(holder.rowView.ivNewHighlight)
    }
}