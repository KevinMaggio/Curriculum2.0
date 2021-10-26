package com.example.curriculum20.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.model.adapter.TecnologiasAdapter
import com.example.curriculum20.model.entity.Cualidades
import com.example.curriculum20.databinding.FragmentSobreMiBinding


class SobreMi : Fragment() {

    private lateinit var binding: FragmentSobreMiBinding
    private val listaCualidades = Cualidades()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSobreMiBinding.inflate(inflater, container, false)
        initRecyclerView2()

        return binding.root
    }

    fun initRecyclerView2() {
        val adapter = TecnologiasAdapter(listaCualidades.getLista())
        binding.rvCualidades.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvCualidades.adapter = adapter
    }
}