package com.example.orgs.ui.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View(this)
        setContentView(R.layout.activity_main)

//        var nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Teste"
//
//        var descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, Magna, Limão"
//
//        var valor = findViewById<TextView>(R.id.valor)
//        valor.text = "R$ 20,30"

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()

    }


}