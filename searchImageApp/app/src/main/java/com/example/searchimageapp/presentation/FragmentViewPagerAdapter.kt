package com.example.searchimageapp.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentViewPagerAdapter (private val activity: FragmentActivity): FragmentStateAdapter(activity) {
    private val fragments: List<Fragment> = listOf(SearchFragment(), GalleryFragment())
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}