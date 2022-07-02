package com.jarvis.ca

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Mark.showAlert(
            this,
            title = "title",
            message = "message",
            color = R.color.colorDefault,
            icon = R.drawable.ic_error
        )

        Handler().postDelayed({
            Mark.showAlert(this, "title 2", "message 2",
            R.color.color1, 3000L, R.drawable.ic_unit)
        }, 5000L)

        Handler().postDelayed({
            Mark.showAlert(this, "title 3", "message 3",
                R.color.color2, 3000L)
        }, 10000L)

        Handler().postDelayed({
            Mark.showAlertSuccess(this, title = "title 4", message = "message 4")
        }, 15000L)

        Handler().postDelayed({
            Mark.showAlertSuccess(this,  message = "message 5")
        }, 20000L)

        Handler().postDelayed({
            Mark.showAlertError(this, title = "title 6", message = "message 6")
        }, 25000L)

        Handler().postDelayed({
            Mark.showAlertError(this,  message = "message 7")
        }, 30000L)

        Handler().postDelayed({
            Mark.showAlertWarning(this, title = "title 8", message = "message 8")
        }, 35000L)

        Handler().postDelayed({
            Mark.showAlertWarning(this,  message = "message 9")
        }, 40000L)
    }
}

