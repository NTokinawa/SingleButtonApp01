package com.example.singlebuttonapp01

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kokobutton = findViewById<Button>(R.id.button1)
        kokobutton.setOnClickListener{
            val url = "https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi-iO_sg-n6AhURPXAKHe1_DN8QwqsBegQIBxAB&url=https%3A%2F%2Fwww.nicovideo.jp%2Fwatch%2Fsm23180895&usg=AOvVaw33__NGCjoO6e76_7q-F3cJ"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
            }
    }
}