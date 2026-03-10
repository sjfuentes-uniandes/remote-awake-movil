package com.example.remoteawake

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<MaterialButton>(R.id.btnTestPrincipal).setOnClickListener {
            startActivity(Intent(this, AlarmRingingActivity::class.java))
        }

        findViewById<MaterialButton>(R.id.btnTestRespaldo).setOnClickListener {
            startActivity(Intent(this, AlarmRingingBackup1Activity::class.java))
        }
    }
}