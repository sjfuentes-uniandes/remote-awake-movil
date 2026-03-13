package com.example.remoteawake

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class VoiceWakeConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voice_wake_confirm)

        findViewById<View>(R.id.ivClose).setOnClickListener {
            finish()
        }
    }
}
