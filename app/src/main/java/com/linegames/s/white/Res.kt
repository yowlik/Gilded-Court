package com.linegames.s.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.linegames.s.R

class Res : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)
        val score=findViewById<TextView>(R.id.scorera)
        val start=findViewById<ImageView>(R.id.start)
        score.text=getIntent().getStringExtra("score")
        start.setOnClickListener {
            val intent= Intent(this@Res,Game::class.java)
            startActivity(intent)
        }
    }

}