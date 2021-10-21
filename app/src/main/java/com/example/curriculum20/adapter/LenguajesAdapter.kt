package com.example.curriculum20.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.curriculum20.R
import com.example.curriculum20.databinding.IitemLenguajesBinding

class LenguajesAdapter(val listaLenguajes: List<String>) : RecyclerView.Adapter<LenguajesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LenguajesHolder {
        return LenguajesHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.iitem_lenguajes, parent, false)
        )
    }

    override fun onBindViewHolder(holder: LenguajesHolder, position: Int) {
        holder.render(listaLenguajes[position])
    }

    override fun getItemCount(): Int {
        return listaLenguajes.size
    }
}

class LenguajesHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var binding = IitemLenguajesBinding.bind(view)

    fun render(lenguaje: String) {
        binding.tvItemLenguaje.text = lenguaje
    }

}
