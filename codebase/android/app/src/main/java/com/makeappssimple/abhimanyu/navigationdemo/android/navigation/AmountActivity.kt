package com.makeappssimple.abhimanyu.navigationdemo.android.navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.makeappssimple.abhimanyu.navigationdemo.android.R

class AmountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amount)
        title = "Amount"

        findViewById<Button>(R.id.next).setOnClickListener {
            startActivity(Intent(this, ReceiptActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_FORWARD_RESULT
            })
            finish()
        }
    }
}