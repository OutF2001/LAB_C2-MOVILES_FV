package com.valdeos.flavio.usolayoutsv4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class PedidoActivity : AppCompatActivity() {

    private lateinit var btnLlamar: ImageButton
    private lateinit var btnWhatsApp: ImageButton
    private lateinit var btnMaps: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        btnLlamar = findViewById(R.id.btnLlamar)
        btnWhatsApp = findViewById(R.id.btnWhatsApp)
        btnMaps = findViewById(R.id.btnMaps)


        btnLlamar.setOnClickListener {
            val phoneNumber = "tel:+123456789"
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse(phoneNumber)
            }
            startActivity(callIntent)
        }

        btnWhatsApp.setOnClickListener {
            val phoneNumber = "123456789"
            val message = "Hola, quiero hacer un pedido"
            val whatsappIntent = Intent(Intent.ACTION_VIEW).apply {
                setPackage("com.whatsapp")
                data = Uri.parse("https://wa.me/$phoneNumber?text=" + Uri.encode(message))
            }
            startActivity(whatsappIntent)
        }

        btnMaps.setOnClickListener {
            val address = "1600 Amphitheatre Parkway, CA"
            val mapUri = Uri.parse("geo:0,0?q=" + Uri.encode(address))
            val mapIntent = Intent(Intent.ACTION_VIEW, mapUri).apply {
                setPackage("com.google.android.apps.maps")
            }
            startActivity(mapIntent)
        }
    }
}