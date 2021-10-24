package com.example.curriculum20.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculum20.R
import com.example.curriculum20.databinding.IitemLenguajesBinding
import com.example.curriculum20.databinding.ItemProyectosBinding
import com.squareup.picasso.Picasso

class GaleriaAdapter(private val listaProyectos: List<String>) : RecyclerView.Adapter<GaleriaHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GaleriaHolder {
        return GaleriaHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_proyectos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GaleriaHolder, position: Int) {
        holder.render(listaProyectos[position])
    }

    override fun getItemCount(): Int {
        return listaProyectos.size
    }
}

class GaleriaHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var binding = ItemProyectosBinding.bind(view)

    fun render(foto: String) {
        Picasso.get().load(foto).into(binding.ivFotoProyecto)
    }

}