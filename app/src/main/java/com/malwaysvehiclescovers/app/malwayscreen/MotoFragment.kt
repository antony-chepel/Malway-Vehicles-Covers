package com.walleyanimalscovers.app.wleyscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.malwaysvehiclescovers.app.databinding.FragmentMotocycleBinding
import com.malwaysvehiclescovers.app.malwaysutils.MalwaysVehiclesUtils
import com.walleyanimalscovers.app.wlayadapter.MalwaysVehiclesAdapter


class MotoFragment : Fragment() {

    private lateinit var binding : FragmentMotocycleBinding
    private var oasdasd : MalwaysVehiclesAdapter? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMotocycleBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rlsajkdasd()
    }
    private fun rlsajkdasd() = with(binding){
        oasdasd = MalwaysVehiclesAdapter(MalwaysVehiclesUtils.motoArray,activity as AppCompatActivity)
        bxgxdasd.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        bxgxdasd.adapter = oasdasd

    }

    companion object {
        @JvmStatic
        fun newInstance() = MotoFragment()
    }
}