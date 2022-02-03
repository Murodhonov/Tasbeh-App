package com.example.tasbehapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)
        supportActionBar?.hide()

        yordam_title2.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("help","Yordam bo'limi")
        header_title.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("ques1","Qanday qilib tasbehni yangilash mumkin ?")
        title3.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("ans1","Assalomu alaykum\nTasbehni yangilash uchun telefoningiz ekranini tepa qismidan pastga qarab tushirasiz.")

    }
}