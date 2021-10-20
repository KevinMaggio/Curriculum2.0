package com.example.curriculum20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.adapter.LenguajesAdapter
import com.example.curriculum20.data.Lengueajes
import com.example.curriculum20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listaLenguajes= Lengueajes()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initRecyclerView()
    }

    fun initRecyclerView(){
        val adapter= LenguajesAdapter(listaLenguajes.getLista())
        binding.rvLenguajes.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvLenguajes.adapter=adapter

    }

}