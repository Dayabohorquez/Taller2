package co.edu.sena.entrega2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val CONSTANTE = "Soy una constante"
    }

    private var mensaje: String = "Hola, Kotlin!"

    private var mensajeOpcional: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        mensajeOpcional = "Este es un mensaje opcional"
        val mensajeMostrar = mensajeOpcional ?: "Mensaje por defecto"

        textView.text = "$mensaje\n$CONSTANTE\n$mensajeMostrar"
    }
}