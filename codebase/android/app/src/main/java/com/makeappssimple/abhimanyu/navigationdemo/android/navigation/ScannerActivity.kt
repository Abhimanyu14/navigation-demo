package com.makeappssimple.abhimanyu.navigationdemo.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.makeappssimple.abhimanyu.navigationdemo.android.R

class ScannerActivity : AppCompatActivity() {
    private val activityRequestCode = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner)
        title = "Scanner"

        findViewById<Button>(R.id.next).setOnClickListener {
            startActivityForResult(Intent(this, AmountActivity::class.java), activityRequestCode)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == activityRequestCode) {
            if (resultCode == RESULT_OK) {
                finish()
            }
        }
    }
}