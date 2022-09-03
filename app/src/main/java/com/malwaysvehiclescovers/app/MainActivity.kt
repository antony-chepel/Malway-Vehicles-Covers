package com.malwaysvehiclescovers.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.malwaysvehiclescovers.app.databinding.MainScreenMalwaysBinding
import com.walleyanimalscovers.app.wlayadapter.MalwaysVpAdapter
import com.walleyanimalscovers.app.wleyscreens.CarsFragment
import com.walleyanimalscovers.app.wleyscreens.MotoFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainScreenMalwaysBinding
    private lateinit var nxnsasd : MalwaysVpAdapter
    val kdsjdsfsdf = listOf<Fragment>(CarsFragment.newInstance(),MotoFragment.newInstance())
    val ksasdasd = listOf<String>("Cars","Motorcycles")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainScreenMalwaysBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pasjsdads()
    }


    private fun pasjsdads() = with(binding){
        nxnsasd = MalwaysVpAdapter(this@MainActivity,kdsjdsfsdf)
        viewPwalley.adapter = nxnsasd
        TabLayoutMediator(tabLayout,viewPwalley){
                tab,pos ->
            tab.text = ksasdasd[pos]
        }.attach()

    }
}