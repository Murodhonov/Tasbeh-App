package com.example.tasbehapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question1.*
import kotlinx.android.synthetic.main.activity_question1.yordam_title2
import kotlinx.android.synthetic.main.activity_question2.*

class Question2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        supportActionBar?.hide()

        yordam_title2.text = getSharedPreferences("language", Context.MODE_PRIVATE).getString("help","Yordam bo'limi")
        header_title2.text = getSharedPreferences("language", Context.MODE_PRIVATE).getString("ques2","Qanday qilib tilni o'zgartirish mumkin ?")
        title5.text = getSharedPreferences("language", Context.MODE_PRIVATE).getString("ans2","Assalomu alaykum\nTasbeh dasturining sozlamalar menyusida tilni o'zgartirish menyusi bor shu yerdan Lotin va krillga o'girishingiz mumkin.")

    }
}