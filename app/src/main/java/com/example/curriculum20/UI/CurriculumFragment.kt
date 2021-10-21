package com.example.curriculum20.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.R
import com.example.curriculum20.adapter.LenguajesAdapter
import com.example.curriculum20.adapter.TecnologiasAdapter
import com.example.curriculum20.data.Lengueajes
import com.example.curriculum20.data.Tecnologias
import com.example.curriculum20.databinding.FragmentCurriculumBinding


class Curriculum : Fragment() {
    private lateinit var binding:FragmentCurriculumBinding

    private val listaLenguajes = Lengueajes()
    private val listaTecnologias = Tecnologias()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding=FragmentCurriculumBinding.inflate(inflater,container,false)




        initRecyclerView()
        initRecyclerView2()

        return binding.root
    }
    fun initRecyclerView() {
        val adapter = LenguajesAdapter(listaLenguajes.getLista())
        binding.rvLenguajes.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvLenguajes.adapter = adapter

    }

    fun initRecyclerView2() {
        val adapter = TecnologiasAdapter(listaTecnologias.getLista())
        binding.rvTecnologias.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvTecnologias.adapter = adapter
    }

}