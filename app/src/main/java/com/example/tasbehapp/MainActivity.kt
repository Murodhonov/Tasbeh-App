package com.example.tasbehapp

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom.view.*
import kotlinx.android.synthetic.main.setting.*
import kotlinx.android.synthetic.main.setting.view.*

class MainActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        title_app.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("logo","Tasbeh dasturi")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_setting.setOnClickListener {
            val view = View.inflate(this,R.layout.setting,null)
            val builder = AlertDialog.Builder(this)
            builder.setView(view)
            view.setting_title.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("setting","Sozlamalar bo'limi")
            view.about_txt.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("about","Dastur haqida")
            view.spinner.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayOf(getSharedPreferences("language",Context.MODE_PRIVATE).getString("til","Tilni o'zgartirish"),"O'zbekcha (Lotin)","Узбекча (Крилл)"))

            fun change(){
                view.setting_title.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("setting","Sozlamalar bo'limi")
                view.about_txt.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("about","Dastur haqida")
            }

            val dialog = builder.create()
            dialog.show()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            view.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    when(position){
                        0-> {}
                        1-> {
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("setting","Sozlamalar bo'limi").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("kuntun","Ovozsiz rejim").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("about","Dastur haqida").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("help","Yordam bo'limi").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ques1","Qanday qilib tasbehni yangilash mumkin ?").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ques2","Qanday qilib tilni o'zgartirish mumkin ?").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("cancel","Bekor qilish !").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("logo","Tasbeh dasturi").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("refresh","Tasbeh yangilandi").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("til","Tilni o'zgartirish").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("sound","Ovozsiz rejim").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ans1","Assalomu alaykum\nTasbehni yangilash uchun telefoningiz ekranini tepa qismidan pastga qarab tushirasiz.").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ans2","Assalomu alaykum\nTasbeh dasturining sozlamalar menyusida tilni o'zgartirish menyusi bor shu yerdan Lotin va krillga o'girishingiz mumkin.").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("bottom","Copyright © 2021\nBarcha huquqlar himoyalangan").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("matn","Assalomu alaykum qadrli foydalanuvchi\n\n Ushbu ilova dizayni va tarjima kodlari 100% dasturchini g'oyasi va mualliflik huquqiga ega hisoblanadi ! \n @Murodhonov siz aziz muhlislarga yangidan yangi ilovalarni taqdim etishda davom etadi ! ").apply()
                            Snackbar.make(root, "O'zbek tili (lotin) o'rnatildi !", Snackbar.LENGTH_LONG).show()
                            change()
                            onStart()
                            dialog.hide()
                        }
                        2->{
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("setting","Созламалар").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("kuntun","Овозсиз режим").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("about","Дастур хақида").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("help","Ёрдам бўлими").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("sound","Овозсиз режим").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ques1","Қандай қилиб тасбехни янгилаш мумкин ?").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ques2","Қандай қилиб тилни ўзгартириш мумкин ?").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ques3","Қандай қилиб овозсиз режимини ёқиш мумкин ?").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("cancel","Бекор қилиш !").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("logo","Тасбех дастури").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("refresh","Тасбех янгиланди").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("til","Тилни ўзгартириш").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ans1","Ассалому алайкум\nтасбехни янгилаш учун телефонингиз екранини тепа қисмидан пастга қараб туширасиз.").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("ans2","Ассалому алайкум\nТасбех дастурининг созламалар менюсида тилни ўзгартириш менюси бор шу ердан лотин криллга ўзгартиришингиз мумкин.").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("bottom","Copyright © 2021\nБарча хуқуқлар химояланган").apply()
                            getSharedPreferences("language",Context.MODE_PRIVATE).edit().putString("matn","Ассалому алайкум қадрли фойдаланувчи\n\nУшбу илова дизайни ва таржима кодлари 100% дастурчининг ғояси ва муаллифлик хуқуқига ега хисобланади ! \n @Murodhonov сиз азиз мухлисларга янгидан янги иловаларни тақдим етишда давом етади !").apply()
                            Snackbar.make(root, "Узбек тили (крилл) урнатилди !", Snackbar.LENGTH_LONG).show()
                            change()
                            onStart()
                            dialog.hide()
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

            }
            view.setting3.setOnClickListener {
                dialog.hide()
                startActivity(Intent(this, AboutMe::class.java))
            }

        }

        btn_help.setOnClickListener {
            val view = View.inflate(this,R.layout.bottom,null)
            val builder = AlertDialog.Builder(this)
            builder.setView(view)
            view.help_title.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("help","Yordam bo'limi")
            view.ques1.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("ques1","Qanday qilib tasbehni yangilash mumkin ?")
            view.ques2.text = getSharedPreferences("language",Context.MODE_PRIVATE).getString("ques2","Qanday qilib tilni o'zgartirish mumkin ?")
            val dialog = builder.create()
            dialog.show()
            view.help_1.setOnClickListener { startActivity(Intent(this,Question1::class.java)) }
            view.help_2.setOnClickListener { startActivity(Intent(this,Question2::class.java)) }
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }

        if (getSharedPreferences("isEmpty",Context.MODE_PRIVATE).getBoolean("Empty",false)){
            four_big.visibility = View.INVISIBLE
            five_big.visibility = View.INVISIBLE
            six_big.visibility = View.INVISIBLE
            seven_big.visibility = View.INVISIBLE
            big_number.text = "2"
            second_big_number.text = "1"
            third_big.text = "0"
        }else{
            third_big.visibility = View.VISIBLE
            four_big.visibility = View.VISIBLE
            five_big.visibility = View.VISIBLE
            six_big.visibility = View.VISIBLE
            seven_big.visibility = View.VISIBLE
            big_number.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number1",2).toString()
            second_big_number.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number2",1).toString()
            third_big.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number3",0).toString()
            four_big.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number4",0).toString()
            five_big.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number5",0).toString()
            six_big.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number6",0).toString()
            seven_big.text = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number7",0).toString()
        }

        refreshApp()

        constraint.setOnClickListener {
            getSharedPreferences("isEmpty",Context.MODE_PRIVATE).edit().putBoolean("Empty",false).apply()
            click(1)
        }
    }

    private fun click(i:Int){

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim_1)
        if (i ==1){ smaller.startAnimation(animation)
        var firstBig = big_number.text.toString().toDouble().toInt()

            firstBig += 1
            val secondBig = firstBig - 1
            val thirdBig = "${firstBig - 2}"
            var fourBig = "${firstBig - 3}"
            var fiveBig = "${firstBig - 4}"
            var sixBig = "${firstBig - 5}"
            var sevenBig = "${firstBig - 6}"

            var correct3 = ""
            var correct4 = ""
            var correct5 = ""
            var correct6 = ""
            var correct7 = ""

            if (thirdBig.toInt() < 0){
                correct3 = ""
                third_big.visibility = View.GONE
            }else{
                correct3 = thirdBig
                third_big.text = correct3
                third_big.visibility = View.VISIBLE
                getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number3",correct3.toInt()).apply()
            }
            if (fourBig.toInt() < 0){
                correct4 = ""
                four_big.visibility = View.GONE
            }else{
                correct4 = fourBig
                four_big.text =  correct4
                four_big.visibility = View.VISIBLE
                getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number4",correct4.toInt()).apply()
            }
            if (fiveBig.toInt() < 0){
                correct5 = ""
                five_big.visibility = View.GONE
            }else{
                correct5 = fiveBig
                five_big.text =  correct5
                five_big.visibility = View.VISIBLE
                getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number5",correct5.toInt()).apply()
            }
            if (sixBig.toInt() < 0){
                correct6 = ""
                six_big.visibility = View.GONE
            }else{
                correct6 = sixBig
                six_big.text =   correct6
                six_big.visibility = View.VISIBLE
                getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number6",correct6.toInt()).apply()
            }
            if (sevenBig.toInt() < 0){
                correct7 = ""
                seven_big.visibility = View.GONE
            }else{
                correct7 = sevenBig
                seven_big.text = correct7
                seven_big.visibility = View.VISIBLE
                getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number7",correct7.toInt()).apply()
            }

            getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number1",firstBig).apply()
            getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number2",firstBig - 1).apply()

        big_number.text = firstBig.toString()
        second_big_number.text = secondBig.toString()

            animation.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    /*line1.visibility = View.INVISIBLE*/
                }
                override fun onAnimationEnd(animation: Animation?) {
                    /*line1.visibility = View.VISIBLE*/
                }
                override fun onAnimationRepeat(animation: Animation?) {
                }
            })

            if (getSharedPreferences("volume",Context.MODE_PRIVATE).getString("sound","on") == "on"){
                val media = MediaPlayer.create(this,R.raw.tasbeh)
                val media2 = MediaPlayer.create(this,R.raw.tasbeh2)
                if (thirdBig.toDouble().toInt() == 33 || thirdBig.toDouble().toInt() == 66 || thirdBig.toDouble().toInt() == 99){
                    media2.start()
                }
                else{
                    media.start()
                }
                media.setOnCompletionListener { mp -> mp.release() }
                media2.setOnCompletionListener { mp2 -> mp2.release() }
            }
        }


    }

    private fun refreshApp() {
        swiper.setOnRefreshListener {

            var firstBig2 = big_number.text.toString().toDouble().toInt()

            four_big.visibility = View.INVISIBLE
            five_big.visibility = View.INVISIBLE
            six_big.visibility = View.INVISIBLE
            seven_big.visibility = View.INVISIBLE

            big_number.text = "2"
            second_big_number.text = "1"
            third_big.text = "0"
            four_big.text = ""
            five_big.text = ""
            six_big.text = ""
            seven_big.text = ""

            getSharedPreferences("isEmpty",Context.MODE_PRIVATE).edit().putBoolean("Empty",true).apply()/*
            getSharedPreferences("numbers",Context.MODE_PRIVATE).edit().putInt("number",firstBig2).apply()*/

            Snackbar.make(root, getSharedPreferences("language",Context.MODE_PRIVATE).getString("refresh","Tasbeh yangilandi").toString(), Snackbar.LENGTH_LONG).setAction(getSharedPreferences("language",Context.MODE_PRIVATE).getString("cancel","Bekor qilish")) {
                getSharedPreferences("isEmpty",Context.MODE_PRIVATE).edit().putBoolean("Empty",false).apply()

                var firstBig = getSharedPreferences("numbers",Context.MODE_PRIVATE).getInt("number1",2).toString().toInt()

                val secondBig = firstBig - 1
                val thirdBig = "${firstBig - 2}"
                var fourBig = "${firstBig - 3}"
                var fiveBig = "${firstBig - 4}"
                var sixBig = "${firstBig - 5}"
                var sevenBig = "${firstBig -6}"

                var correct3 = ""
                var correct4 = ""
                var correct5 = ""
                var correct6 = ""
                var correct7 = ""

                big_number.text = firstBig.toString()
                second_big_number.text = secondBig.toString()

                if (thirdBig.toInt() < 0){
                    correct3 = ""
                    third_big.visibility = View.GONE
                }else{
                    correct3 = thirdBig
                    third_big.text = correct3
                    third_big.visibility = View.VISIBLE
                }
                if (fourBig.toInt() < 0){
                    correct4 = ""
                    four_big.visibility = View.GONE
                }else{
                    correct4 = fourBig
                    four_big.text =  correct4
                    four_big.visibility = View.VISIBLE
                }
                if (fiveBig.toInt() < 0){
                    correct5 = ""
                    five_big.visibility = View.GONE
                }else{
                    correct5 = fiveBig
                    five_big.text =  correct5
                    five_big.visibility = View.VISIBLE
                }
                if (sixBig.toInt() < 0){
                    correct6 = ""
                    six_big.visibility = View.GONE
                }else{
                    correct6 = sixBig
                    six_big.text =   correct6
                    six_big.visibility = View.VISIBLE
                }
                if (sevenBig.toInt() < 0){
                    correct7 = ""
                    seven_big.visibility = View.GONE
                }else{
                    correct7 = sevenBig
                    seven_big.text = correct7
                    seven_big.visibility = View.VISIBLE
                }

            }.show()

            swiper.isRefreshing = false

        }
    }
}