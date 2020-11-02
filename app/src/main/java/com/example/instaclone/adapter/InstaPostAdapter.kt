package com.example.instaclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.dataclasses.InstaPost
import com.example.instaclone.R
import kotlinx.android.synthetic.main.row_post_item.view.*

class InstaPostAdapter(var instaPostList: List<InstaPost>):RecyclerView.Adapter<InstaPostAdapter.InstaPostViewHolder>() {

    class InstaPostViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaPostViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.row_post_item,parent,false)
        return InstaPostViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: InstaPostViewHolder, position: Int) {
        var instaPost=instaPostList.get(position)
        Glide
            .with(holder.itemView.context)
            .load(instaPost.avatarUrl)
            .circleCrop()
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.itemView.ivAvatar)

        holder.itemView.tvUsername.text=instaPost.username

        Glide
            .with(holder.itemView.context)
            .load(instaPost.imageUrl)
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.itemView.imgPost)

        holder.itemView.tvLikes.text="${instaPost.likesCount} Liked your post"
        holder.itemView.tvUsername2.text=instaPost.username
        holder.itemView.tvCaption.text=instaPost.caption

    }

    override fun getItemCount(): Int {
        return instaPostList.size
    }
}