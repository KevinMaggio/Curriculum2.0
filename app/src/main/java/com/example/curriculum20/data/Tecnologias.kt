package com.example.curriculum20.data

class Tecnologias {
    private var listaTecnologias = listOf<String>(
        "FIREBASE",
        "COMPONENT NAVIGATION",
        "RETROFIT 2",
        "OKHTTP",
        "HILT",
        "MVVM",
        "VIEWBINDING",
        "PICASSO",
        "RECYCLERVIEW",
        "TEST UNITARIOS"
    )

    fun getLista(): List<String> {
        return listaTecnologias
    }
}