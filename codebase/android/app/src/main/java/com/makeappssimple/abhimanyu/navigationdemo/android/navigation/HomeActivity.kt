package com.makeappssimple.abhimanyu.navigationdemo.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.makeappssimple.abhimanyu.navigationdemo.android.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        title = "Home"

        findViewById<Button>(R.id.open_scanner).setOnClickListener {
            startActivity(Intent(this, ScannerActivity::class.java))
        }
    }
}