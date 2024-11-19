package com.example.orgs.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produtos
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View(this)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produto = listOf(
            Produtos(
                nome = "teste",
                descricao = "para teste",
                valor = BigDecimal("10.71")
            ),
            Produtos(
                nome = "teste2",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            ),
            Produtos(
                nome = "teste3",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            ),
            Produtos(
                nome = "teste4",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            ),
            Produtos(
                nome = "teste5",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            ),
            Produtos(
                nome = "teste6",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            ),
            Produtos(
                nome = "teste7",
                descricao = "para teste2",
                valor = BigDecimal("10.72")
            )

        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}