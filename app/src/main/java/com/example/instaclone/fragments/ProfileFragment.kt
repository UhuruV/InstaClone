package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.MainActivity
import com.example.instaclone.ProfilePostAdapter
import com.example.instaclone.dataclasses.NewHighlight
import com.example.instaclone.R
import com.example.instaclone.adapter.InstaProfileAdapter
import com.example.instaclone.adapter.NewHiglightAdapter
import com.example.instaclone.dataclasses.Highlights
import com.example.instaclone.dataclasses.Profile
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
        (activity as MainActivity?)!!.supportActionBar?.setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showHighlights()
        showNewHighlight()
        profilePosts()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.profile_middle_menu,menu)
    }
    fun showHighlights() {
        val profileHiglights = ArrayList<Highlights>()
        profileHiglights.add(Highlights("https://images.all-free-download.com/images/graphicthumb/beautiful_small_flowers_vector_1_155885.jpg","Flowers"))
        profileHiglights.add(Highlights("https://sf.tac-cdn.net/images/products/large/SF-P-2.jpg?auto=webp&quality=80","Travel"))
        profileHiglights.add(Highlights("https://i.pinimg.com/236x/fd/79/25/fd792598e526fc90f923b8f2689be75c--tiny-flowers-unusual-flowers.jpg","Destination"))
        profileHiglights.add(Highlights("https://cdn.pixabay.com/photo/2019/05/06/23/29/spring-4184594__340.jpg","Happiness"))
        profileHiglights.add(Highlights("https://i.etsystatic.com/12816843/r/il/d8d5cc/1197768663/il_570xN.1197768663_6ouk.jpg","Joy"))
        profileHiglights.add(Highlights("https://i.etsystatic.com/6090048/r/il/313024/1229524949/il_570xN.1229524949_jwdd.jpg","Cooking"))

        val profileHighlightAdapter=InstaProfileAdapter(profileHiglights)
        rvProfile.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvProfile.adapter=profileHighlightAdapter
    }
    fun showNewHighlight(){
        val newProfileHighlight=ArrayList<NewHighlight>()
        newProfileHighlight.add(
            NewHighlight(
                " ",
                "New"
            )
        )
        val newHiglightAdapter=NewHiglightAdapter(newProfileHighlight)
        rvHighlights.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvHighlights.adapter=newHiglightAdapter
    }
    fun profilePosts(){
        val profilePost=ArrayList<Profile>()
        profilePost.add(Profile("https://images.all-free-download.com/images/graphicthumb/beautiful_small_flowers_vector_1_155885.jpg"))
        profilePost.add(Profile("https://sf.tac-cdn.net/images/products/large/SF-P-2.jpg?auto=webp&quality=80"))
        profilePost.add(Profile("https://i.pinimg.com/236x/fd/79/25/fd792598e526fc90f923b8f2689be75c--tiny-flowers-unusual-flowers.jpg"))
        profilePost.add(Profile("https://images.all-free-download.com/images/graphicthumb/beautiful_small_flowers_vector_1_155885.jpg"))
        profilePost.add(Profile("https://i.etsystatic.com/12816843/r/il/d8d5cc/1197768663/il_570xN.1197768663_6ouk.jpg"))
        profilePost.add(Profile("https://images.all-free-download.com/images/graphicthumb/beautiful_small_flowers_vector_1_155885.jpg"))
        profilePost.add(Profile("https://i.etsystatic.com/12816843/r/il/d8d5cc/1197768663/il_570xN.1197768663_6ouk.jpg"))
        profilePost.add(Profile("https://i.pinimg.com/236x/fd/79/25/fd792598e526fc90f923b8f2689be75c--tiny-flowers-unusual-flowers.jpg"))
        profilePost.add(Profile("https://i.pinimg.com/236x/fd/79/25/fd792598e526fc90f923b8f2689be75c--tiny-flowers-unusual-flowers.jpg"))

        val profilePostAdapter=ProfilePostAdapter(profilePost)
        rvProfilePost.layoutManager=GridLayoutManager(context,3)
        rvProfilePost.adapter=profilePostAdapter
    }
}