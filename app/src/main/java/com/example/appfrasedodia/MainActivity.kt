package com.example.appfrasedodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var   texto: TextView
    val frase = arrayOf(
         "A persistência é o caminho do êxito","" +
         "As pessoas costumam dizer que a motivação não dura sempre. Bem, nem o efeito do banho, por isso recomenda-se diariamente.",
         "Motivação é a arte de fazer as pessoas fazerem o que você quer que elas façam porque elas o querem fazer."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textoFrase)

    }
    fun GerarFrase(view: View){
        val totalItensArray = frase.size
        val numeAleatorio = Random().nextInt(totalItensArray)
        texto.setText(frase[numeAleatorio])
    }
}