package com.example.curriculum20.model.entity

class Lengueajes {

    private var listaLengueajes = listOf<String>("JAVA", "KOTLIN", "SQL", "HTTP", "JS", "CSS")

    fun getLista(): List<String> {
        return listaLengueajes
    }
}