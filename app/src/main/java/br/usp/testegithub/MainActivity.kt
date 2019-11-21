package br.usp.testegithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ola = btnOla

        ola.setOnClickListener {
            Toast.makeText(this, "Ola Visitante!", Toast.LENGTH_LONG).show()
        }
    }
}