package com.example.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produtos


class ListaProdutosAdapter(
    private val produto: List<Produtos>,
    private val context: Context
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produtos) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return produto.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produtos = produto[position]
        holder.vincula(produtos)

    }

}
