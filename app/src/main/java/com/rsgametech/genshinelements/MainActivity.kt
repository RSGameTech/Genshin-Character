package com.rsgametech.genshinelements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonPyro = findViewById<Button>(R.id.btnPyro)
        val buttonHydro = findViewById<Button>(R.id.btnHydro)
        val buttonAnemo = findViewById<Button>(R.id.btnAnemo)
        val buttonDendro = findViewById<Button>(R.id.btnDendro)
        val buttonElectro = findViewById<Button>(R.id.btnElectro)
        val buttonCryo = findViewById<Button>(R.id.btnCryo)
        val buttonGeo = findViewById<Button>(R.id.btnGeo)

        buttonPyro.setOnClickListener {
            intent = Intent(applicationContext, Pyro::class.java)
            startActivity(intent)
        }
        buttonHydro.setOnClickListener {
            intent = Intent(applicationContext, Hydro::class.java)
            startActivity(intent)
        }
        buttonAnemo.setOnClickListener {
            intent = Intent(applicationContext, Anemo::class.java)
            startActivity(intent)
        }
        buttonDendro.setOnClickListener {
            intent = Intent(applicationContext, Dendro::class.java)
            startActivity(intent)
        }
        buttonElectro.setOnClickListener {
            intent = Intent(applicationContext, Electro::class.java)
            startActivity(intent)
        }
        buttonCryo.setOnClickListener {
            intent = Intent(applicationContext, Cryo::class.java)
            startActivity(intent)
        }
        buttonGeo.setOnClickListener {
            intent = Intent(applicationContext, Geo::class.java)
            startActivity(intent)
        }
    }
}