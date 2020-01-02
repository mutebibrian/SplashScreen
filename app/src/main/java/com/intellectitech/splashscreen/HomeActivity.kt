package com.intellectitech.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        }

    private fun BuClickEvent(View : View){

        val userDob: String = editText.text.toString()
        val year: Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDob.toInt()
        age.setText("your age show here "+myAge)
    }
}