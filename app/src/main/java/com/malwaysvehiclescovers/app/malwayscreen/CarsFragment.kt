package com.walleyanimalscovers.app.wleyscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.malwaysvehiclescovers.app.databinding.FragmentCarsBinding
import com.malwaysvehiclescovers.app.malwaysutils.MalwaysVehiclesUtils
import com.walleyanimalscovers.app.wlayadapter.MalwaysVehiclesAdapter


class CarsFragment : Fragment() {

    private lateinit var binding : FragmentCarsBinding
    private var odsfsdf : MalwaysVehiclesAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarsBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        psaodsad()

    }

    private fun psaodsad() = with(binding){
        odsfsdf = MalwaysVehiclesAdapter(MalwaysVehiclesUtils.carArray,activity as AppCompatActivity)
        nsajsd.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        nsajsd.adapter = odsfsdf

    }

    companion object {

        @JvmStatic
        fun newInstance() = CarsFragment()
    }
}