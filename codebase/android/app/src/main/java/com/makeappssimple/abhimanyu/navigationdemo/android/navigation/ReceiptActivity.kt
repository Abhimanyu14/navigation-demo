package com.makeappssimple.abhimanyu.navigationdemo.android.navigation

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.makeappssimple.abhimanyu.navigationdemo.android.R

class ReceiptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)
        title = "Receipt"

        findViewById<Button>(R.id.close).setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}