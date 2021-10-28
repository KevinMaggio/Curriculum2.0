package com.example.curriculum20.view

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.curriculum20.R
import com.example.curriculum20.view.adapter.LenguajesAdapter
import com.example.curriculum20.view.adapter.TecnologiasAdapter
import com.example.curriculum20.model.entity.Lengueajes
import com.example.curriculum20.model.entity.Tecnologias
import com.example.curriculum20.databinding.FragmentCurriculumBinding


class Curriculum : Fragment() {
    private lateinit var binding: FragmentCurriculumBinding

    private val listaLenguajes = Lengueajes()
    private val listaTecnologias = Tecnologias()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCurriculumBinding.inflate(inflater, container, false)
        initRecyclerView()
        initRecyclerView2()
        binding.btLinkedin.setOnClickListener {
            dialog("LinkedIn", "Gracias por el interes hacia mi Perfil","linkedin")
        }
        binding.btCurriculum.setOnClickListener {
            dialog("Mi curriculum", "Diseño creado en formato APK", "curriculum")
        }
        binding.btMail.setOnClickListener {
            dialog("Mi Email","KevinMaggio57@Gmail.com","email")
        }
        binding.btWhatsapp.setOnClickListener {
            dialog("Mi WhatSapp", "11-6239-9695", "whatsapp")
        }


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

    private fun dialog(title: String, message: String, uso: String) {

        lateinit var dialog: AlertDialog
        when (uso) {
            "linkedin" -> dialog =
                AlertDialog.Builder(context, R.style.MyDialog)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton("Abrir") { _, _ ->
                        val uri = Uri.parse("https://www.linkedin.com/in/kevin-maggio57/")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))
                    }
                    .setNeutralButton("Cerrar") { _, _ -> }
                    .create()
            "email" -> dialog =
                AlertDialog.Builder(context, R.style.MyDialog)
                    .setTitle(title)
                    .setMessage(message)
                    .setNeutralButton("Cerrar") { _, _ -> }
                    .create()
            "curriculum" -> dialog =
                AlertDialog.Builder(context, R.style.MyDialog)
                    .setTitle(title)
                    .setMessage(message)
                    .setPositiveButton("Abrir") { _, _ ->
                        val uri = Uri.parse("https://github.com/KevinMaggio/Curriculum2.0")
                        startActivity(Intent(Intent.ACTION_VIEW, uri))
                    }
                    .setNeutralButton("Cerrar") { _, _ -> }
                    .create()
            "whatsapp" -> dialog =
                AlertDialog.Builder(context, R.style.MyDialog)
                    .setTitle(title)
                    .setMessage(message)
                    .setNeutralButton("Cerrar") { _, _ -> }
                    .create()
        }
        dialog.show()
    }
}