package com.example.orgs.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.orgs.R
import com.example.orgs.model.Produtos
import org.w3c.dom.Text

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val botaoSalvar = findViewById<Button>(R.id.BotSalvar)
        botaoSalvar.setOnClickListener {
            val campoNome = findViewById<EditText>(R.id.nomeProduto).text.toString()
            val descricaoItem = findViewById<EditText>(R.id.descricao).text.toString()
            val valorItem = findViewById<EditText>(R.id.valor).text.toString()
            val observacaoItem = findViewById<EditText>(R.id.Observacao).text.toString()

            Log.i("FormularioProdutoActivity", "Oncreate:$campoNome,$descricaoItem,$valorItem,$observacaoItem")

            val novoProduto =Produtos(
                nome = campoNome,
                descricao = descricaoItem,
                valor = valorItem.toBigDecimal()
            )

            Log.i("FormularioProdutoActivity", "Oncreate:$novoProduto")
        }


    }

}