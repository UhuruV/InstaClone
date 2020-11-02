package com.example.instaclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instaclone.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()
    }

    fun setupViewPager(){
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        vPager.adapter = viewPagerAdapter
        bottomNavigationView.setOnNavigationItemSelectedListener { item->
            return@setOnNavigationItemSelectedListener when(item.itemId){
                R.id.home->{
                    vPager.currentItem = 0
                    true
                }

                R.id.search->{
                    vPager.currentItem = 1
                    true
                }

                R.id.add->{
                    vPager.currentItem = 2
                    true
                }

                R.id.activity->{
                    vPager.currentItem = 3
                    true
                }

                R.id.profile->{
                    vPager.currentItem = 4
                    true
                }
                else->{
                    false
                }
            }
        }
    }

    fun setUpViewPager2(){
        val vpa=ViewPagerAdapter(supportFragmentManager)
        vPager.adapter=vpa
    }
}
