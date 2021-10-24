package com.example.curriculum20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.UI.HomeMenu
import com.example.curriculum20.adapter.LenguajesAdapter
import com.example.curriculum20.adapter.TecnologiasAdapter
import com.example.curriculum20.data.Lengueajes
import com.example.curriculum20.data.Tecnologias
import com.example.curriculum20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {
            startActivity(Intent(this, HomeMenu::class.java))
        }
    }
}