package com.example.remoteawake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class AlarmRingingBackup2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_ringing_backup2)

        findViewById<Button>(R.id.btnConfirmWakeUp).setOnClickListener {
            finish()
        }
    }
}
