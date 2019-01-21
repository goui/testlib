package com.github.goui.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.goui.mylibrary.LibActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text_view.setOnClickListener { startActivity(LibActivity.getStartingIntent(this)) }
    }
}
