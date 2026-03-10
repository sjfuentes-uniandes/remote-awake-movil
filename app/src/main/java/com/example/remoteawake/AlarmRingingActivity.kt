package com.example.remoteawake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class AlarmRingingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_ringing)

        findViewById<Button>(R.id.btnConfirmWakeUp).setOnClickListener {
            finish()
        }
    }
}
