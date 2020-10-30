package com.av1.tutorial.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.av1.tutorial.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(R.layout.activity_register) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        register_image_back.setOnClickListener {
            finish()
        }

        register_button_primary.setOnClickListener {
            finish()
        }
    }
}