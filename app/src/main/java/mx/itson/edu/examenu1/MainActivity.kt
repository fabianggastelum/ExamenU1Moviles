package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    val btnCelsius: Button = findViewById(R.id.btnGC)
    val btnFahrenheit: Button = findViewById(R.id.btnGF)
    val txtResultadoC: TextView = findViewById(R.id.etC)
    val txtResultadoF: TextView = findViewById(R.id.etF)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCelsius.setOnClickListener{
            val resultadoC = ((txtResultadoF.text.toString().toDouble() - 32) * (5/9))
            val resultadoCFormato = "%.2f".format(resultadoC)
            txtResultadoC.setText(resultadoCFormato)
        }

        btnFahrenheit.setOnClickListener {
            val resultadoF = ((txtResultadoC.text.toString().toDouble() * 1.8) + 32)
            val resultadoFFormato = "%.2f".format(resultadoF)
            txtResultadoF.setText(resultadoFFormato)
        }

    }


}