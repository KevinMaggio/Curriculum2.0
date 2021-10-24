package com.example.curriculum20.data

class Cualidades {
    private var listaCualidades= listOf<String>("COMPAÑERO", "ANALISTA", "DETALLISTA","SOCIAL", "RESPONSABLE","ENTUSIASTA", "CREATIVO")

    fun getLista(): List<String> {
        return listaCualidades
    }
}