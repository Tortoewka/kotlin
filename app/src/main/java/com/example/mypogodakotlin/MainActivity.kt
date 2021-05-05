package com.example.mypogodakotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.math.RoundingMode.valueOf
import java.util.*


class MainActivity : AppCompatActivity() {

    private var textView: String? = null
    private var arg2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView1 = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        button.setOnClickListener {
            data class MyClass(var name: String, var text2: String) {
            }
            fun klass() = MyClass("привет", "человек")
            textView1.text = klass().name
            textView2.text = klass().text2
        }
    }
}
