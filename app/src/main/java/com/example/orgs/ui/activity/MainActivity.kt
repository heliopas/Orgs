package com.example.orgs.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produtos
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
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
            )

        ))
        recyclerView.layoutManager = LinearLayoutManager(this)

        val addButton = findViewById<FloatingActionButton>(R.id.addProdutoButton)
        addButton.setOnClickListener{
            val formularioScreen = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(formularioScreen)
        }


    }






}