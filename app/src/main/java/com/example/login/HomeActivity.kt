package com.example.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val saveId = intent.getStringExtra("saveId") //id 가져오기
        val et_id = findViewById<EditText>(R.id.et_home_id)
        et_id.setText(saveId) //id 불러오기

        fun btnClick(view: View){
            when(view.getId()){
                R.id.btn_velog -> {
                    val velog_intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://velog.io/@godls20455/posts"))
                    startActivity(velog_intent)
                }
                R.id.btn_github -> {
                    val github_intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/godls20455/godls20455"))
                    startActivity(github_intent)
                }
            }
        }

        val btn_finish = findViewById<Button>(R.id.btn_finish) //종료 버튼 연결
        btn_finish.setOnClickListener {
            finish()
        }

    }
}