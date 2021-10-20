package com.example.curriculum20.data

class Tecnologias {
    private var listaTecnologias= listOf<String>("FireBase", "Component Navigation", "Retrofit2", "OkHttp", "Hilt", "MVVM", "ViewBinding", "Picasso", "RecyclerView","Test Unitarios")

    fun getLista(): List<String> {
        return listaTecnologias
    }
}