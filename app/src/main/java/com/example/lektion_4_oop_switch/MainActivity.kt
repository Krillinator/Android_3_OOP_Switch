package com.example.lektion_4_oop_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lektion_4_oop_switch.databinding.ActivityMainBinding
import com.example.lektion_4_oop_switch.models.Student

class MainActivity : AppCompatActivity() {

    // Make sure you set this setting to true --> Gradle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // TODO - Check it out

        // Assign value to binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Define Components
        val btnTest: Button = findViewById(R.id.textView)
        val btnTest2 = binding.textView

    }

}