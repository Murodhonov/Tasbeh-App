package com.example.tasbehapp

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        supportActionBar?.hide()

        text1.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("name","Murodhonov Umarxon")
        text2.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("android","Android Developer")
        txt_6.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("bottom","Copyright © 2021\nBarcha huquqlar himoyalangan")

        txt_field.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("matn","Assalomu alaykum qadrli foydalanuvchi\n\n Ushbu ilova dizayni va tarjima kodlari 100% dasturchini g'oyasi va mualliflik huquqiga ega hisoblanadi ! \n @Murodhonov siz aziz muhlislarga yangidan yangi ilovalarni taqdim etishda davom etadi ! ")

    }
   /* fun _TypeWriterEffect(text: String, tw: TextView, delay: Double) {
        var timer : Timer
        var endStr = ""
        var i = 0
        var tmr = object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    if (!(i === text.length)) {
                        val jg = "" + text
                        val ug = jg[i]
                        endStr = endStr + "" + ug
                        tw.text = endStr
                        i++
                    } else {
                        tmr.cancel()
                    }
                }
            }
        }
        timer.scheduleAtFixedRate(tmr, delay.toInt(), delay.toInt())
    }*/
}