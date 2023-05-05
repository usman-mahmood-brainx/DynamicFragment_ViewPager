package com.example.dynamicfragment_viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dynamicfragment_viewpager.databinding.FragmentDynamicBinding


class DynamicFragment(private val fragmentTitle: String) : Fragment() {

    lateinit var fragmentDynamicBinding: FragmentDynamicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentDynamicBinding = FragmentDynamicBinding.inflate(inflater,container,false)
        fragmentDynamicBinding.tvFragmentTitle.text = fragmentTitle
        return fragmentDynamicBinding.root
    }

}