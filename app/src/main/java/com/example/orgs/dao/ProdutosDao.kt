package com.example.orgs.dao

import com.example.orgs.model.Produtos

class ProdutosDao {

    fun adicionar(produtos: Produtos){
        Companion.produto.add(produtos)
    }

    fun buscaTodos() : List<Produtos>{
        return Companion.produto.toList()
    }

    companion object {
        private val produto = mutableListOf<Produtos>()
    }


}