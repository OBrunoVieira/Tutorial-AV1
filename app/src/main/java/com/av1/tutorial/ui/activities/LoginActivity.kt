package com.av1.tutorial.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.av1.tutorial.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(R.layout.activity_login) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login_button_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        login_button_primary.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}