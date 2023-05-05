package com.example.dynamicfragment_viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.dynamicfragment_viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        val fragmentList = mutableListOf<Fragment>(
            DynamicFragment("First Fragment"),
            DynamicFragment("Second Fragment"),
            DynamicFragment("Third Fragment"),
            DynamicFragment("Fourth Fragment"),
            DynamicFragment("Fifth Fragment"),
        )

        var adapterViewPager = AdapterViewPager(this,fragmentList)
        // set Adapter
        mainBinding.pagerMain.adapter = adapterViewPager
        mainBinding.pagerMain.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                // Called when a new page has been selected
                super.onPageSelected(position)
            }

        })

    }
}