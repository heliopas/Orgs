package com.example.orgs

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : Activity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View(this)
        setContentView(R.layout.activity_main)

        var nome = findViewById<TextView>(R.id.nome)
        nome.text = "Teste"

        var descricao = findViewById<TextView>(R.id.descricao)
        descricao.text = "Laranja, Magna, Limão"

        var valor = findViewById<TextView>(R.id.valor)
        valor.text = "R$ 20,30"


    }


}