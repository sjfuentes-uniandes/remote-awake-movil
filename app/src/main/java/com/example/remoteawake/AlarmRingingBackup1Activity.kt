package com.example.remoteawake

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class AlarmRingingBackup1Activity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    private var hasInteracted = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_ringing_backup1)

        findViewById<MaterialButton>(R.id.btnConfirmWakeUp).setOnClickListener {
            hasInteracted = true
            handler.removeCallbacksAndMessages(null)
            startActivity(Intent(this, VoiceWakeConfirmActivity::class.java))
            overridePendingTransition(0, 0)
            finish()
        }

        handler.postDelayed({
            if (!hasInteracted) {
                startActivity(Intent(this, AlarmRingingBackup2Activity::class.java))
                overridePendingTransition(0, 0)
                finish()
            }
        }, 2000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}
