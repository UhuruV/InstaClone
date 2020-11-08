package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.dataclasses.Profile
import kotlinx.android.synthetic.main.profile_row_list_item.view.*

class ProfilePostAdapter(val profilePostList: List<Profile>):RecyclerView.Adapter<ProfilePostAdapter.ProfilePostViewHolder>() {
    class ProfilePostViewHolder(val rowView:View):RecyclerView.ViewHolder(rowView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilePostViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.profile_row_list_item,parent,false)
        return ProfilePostViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return profilePostList.size
    }

    override fun onBindViewHolder(holder: ProfilePostViewHolder, position: Int) {
       val profilePosts=profilePostList.get(position)
        Glide
            .with(holder.rowView.context)
            .load(profilePosts.imageUrl)
            .placeholder(R.drawable.ic_image_placeholder)
            .into(holder.rowView.ivProfileImage)

    }
}