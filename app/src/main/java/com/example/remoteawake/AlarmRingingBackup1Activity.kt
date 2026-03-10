package com.example.remoteawake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class AlarmRingingBackup1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_ringing_backup1)

        findViewById<Button>(R.id.btnConfirmWakeUp).setOnClickListener {
            finish()
        }
    }
}
