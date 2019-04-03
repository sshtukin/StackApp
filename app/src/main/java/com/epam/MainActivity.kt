package com.epam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myStack: MyStack<Editable> = MyStack()
        val tvStack = findViewById<TextView>(R.id.tv_stack)
        val etStack = findViewById<EditText>(R.id.et_stack)
        val btnPop = findViewById<Button>(R.id.btn_pop)
        val btnPush = findViewById<Button>(R.id.btn_push)

        btnPush.setOnClickListener {
            myStack.push(etStack.text)
            etStack.text = null
            tvStack.text = myStack.toString()
        }

        btnPop.setOnClickListener {
            etStack.text = myStack.pop()
            tvStack.text = myStack.toString()
        }
    }
}
