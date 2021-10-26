package com.example.curriculum20.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.model.adapter.GaleriaAdapter
import com.example.curriculum20.model.entity.Proyectos
import com.example.curriculum20.databinding.FragmentGaleriaBinding


class Galeria : Fragment() {

    private lateinit var binding: FragmentGaleriaBinding
    private val listaProyectos= Proyectos()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentGaleriaBinding.inflate(inflater, container, false)
        initRecyclerViewObra()
        initRecyclerViewQuecomer()
        initRecyclerViewSomosMas()

        return binding.root
    }

    fun initRecyclerViewSomosMas(){
        var adapter= GaleriaAdapter(listaProyectos.getFotosSomosMas())
        binding.rvSomosMas.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvSomosMas.adapter=adapter
    }
    fun initRecyclerViewQuecomer(){
        var adapter= GaleriaAdapter(listaProyectos.getFotosQuecomer())
        binding.rvQueComer.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvQueComer.adapter=adapter
    }
    fun initRecyclerViewObra(){
        var adapter=GaleriaAdapter(listaProyectos.getFotosCalculosObra())
        binding.rvCalculosObra.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        binding.rvCalculosObra.adapter=adapter
    }
}