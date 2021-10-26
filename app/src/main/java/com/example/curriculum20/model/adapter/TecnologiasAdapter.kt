package com.example.curriculum20.model.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculum20.R
import com.example.curriculum20.databinding.ItemTecnologiasBinding

class TecnologiasAdapter(private val listaTecnologias: List<String>) :
    RecyclerView.Adapter<TecnologiasHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TecnologiasHolder {
        return TecnologiasHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_tecnologias, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TecnologiasHolder, position: Int) {
        holder.render(listaTecnologias[position])
    }

    override fun getItemCount(): Int {
        return listaTecnologias.size
    }
}

class TecnologiasHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var binding = ItemTecnologiasBinding.bind(view)

    fun render(tecnologias: String) {
        binding.tvItemTecnologias.text = tecnologias
    }
}