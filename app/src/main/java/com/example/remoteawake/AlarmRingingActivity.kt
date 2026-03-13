package com.example.remoteawake

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class AlarmRingingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_ringing)

        findViewById<MaterialButton>(R.id.btnConfirmWakeUp).setOnClickListener {
            startActivity(Intent(this, VoiceWakeConfirmActivity::class.java))
            overridePendingTransition(0, 0)
            finish()
        }
    }
}
