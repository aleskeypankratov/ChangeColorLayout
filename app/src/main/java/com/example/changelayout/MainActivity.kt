package com.example.changelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickGoNeedActivity(view: View) {
        val intent: Intent = when (view.id) {
            R.id.blueButton -> Intent(this, BlueActivity::class.java)
            R.id.greenButton -> Intent(this, GreenActivity::class.java)
            R.id.redButton -> Intent(this, RedActivity::class.java)
            else -> {
                throw Exception()
            }
        }
        startActivity(intent)
    }
}