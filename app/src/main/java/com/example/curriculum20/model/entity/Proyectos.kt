package com.example.curriculum20.model.entity

class Proyectos {
    private val listaFotosSomosMas = listOf<String>(   "https://i.ibb.co/7WMfSzw/Whats-App-Image-2021-10-23-at-16-43-47-9.jpg",
        "https://i.ibb.co/hyz9dBG/Whats-App-Image-2021-10-23-at-16-43-47-8.jpg",
        "https://i.ibb.co/bW8jQX4/Whats-App-Image-2021-10-23-at-16-43-47-7.jpg",
        "https://i.ibb.co/z8cBb0s/Whats-App-Image-2021-10-23-at-16-43-47-6.jpg",
        "https://i.ibb.co/nCCVCJV/Whats-App-Image-2021-10-23-at-16-43-47-5.jpg"
    )

    private val listaFotosCalculosObra = listOf<String>(
        "https://i.ibb.co/KzWXTSz/Whats-App-Image-2021-10-23-at-16-43-47-4.jpg",
        "https://i.ibb.co/NnGtDym/Whats-App-Image-2021-10-23-at-16-43-47-3.jpg"
    )

    private val listaFotosQueComer = listOf<String>(    "https://i.ibb.co/m4zxD3k/Whats-App-Image-2021-10-23-at-16-43-47-2.jpg",
        "https://i.ibb.co/27pF7Dm/Whats-App-Image-2021-10-23-at-16-43-47-1.jpg",
        "https://i.ibb.co/VLKVpJf/Whats-App-Image-2021-10-23-at-16-43-47.jpg"
    )

    fun getFotosQuecomer(): List<String> {
        return listaFotosQueComer
    }
    fun getFotosCalculosObra(): List<String> {
        return listaFotosCalculosObra
    }
    fun getFotosSomosMas(): List<String> {
        return listaFotosSomosMas
    }
}