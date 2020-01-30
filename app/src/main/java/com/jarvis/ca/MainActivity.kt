package com.jarvis.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Mark.showAlert(this@MainActivity, null, "message", R.color.colorAccent, 3000)
    }
}
