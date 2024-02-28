package com.example.lektion_4_oop_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lektion_4_oop_switch.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    // ActivityABOUTBinding <-- changes name based on Activity! :)
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
}