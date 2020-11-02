package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.instaclone.MainActivity
import com.example.instaclone.R
import com.example.instaclone.dataclasses.Highlights
import kotlinx.android.synthetic.main.fragment_home.*


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
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.profile_middle_menu,menu)
    }
    fun showHighlights() {
        val profileHiglights = ArrayList<Highlights>()
        profileHiglights.add(Highlights("https://images.all-free-download.com/images/graphicthumb/beautiful_small_flowers_vector_1_155885.jpg","Flowers"))
        profileHiglights.add(Highlights("https://sf.tac-cdn.net/images/products/large/SF-P-2.jpg?auto=webp&quality=80","Flowers"))
        profileHiglights.add(Highlights("https://i.pinimg.com/236x/fd/79/25/fd792598e526fc90f923b8f2689be75c--tiny-flowers-unusual-flowers.jpg","Flowers"))
        profileHiglights.add(Highlights("https://cdn.pixabay.com/photo/2019/05/06/23/29/spring-4184594__340.jpg","Flowers"))
        profileHiglights.add(Highlights("https://i.etsystatic.com/12816843/r/il/d8d5cc/1197768663/il_570xN.1197768663_6ouk.jpg","Flowers"))
        profileHiglights.add(Highlights("https://i.etsystatic.com/6090048/r/il/313024/1229524949/il_570xN.1229524949_jwdd.jpg","Flowers"))
    }
}