package com.example.login

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val id = findViewById<EditText>(R.id.et_id)
        val pw = findViewById<EditText>(R.id.et_pw)
        val name = findViewById<EditText>(R.id.et_name)
        val btn_signUp = findViewById<Button>(R.id.btn_signUp)
        var checkId = false
        var checkPw = false
        var checkName = false
        btn_signUp.isEnabled = false

        id.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            } //id 변경전

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            } //id 변경중

            override fun afterTextChanged(s: Editable?) {
                if (!s.isNullOrEmpty()){
                    checkId = true
                    if(checkId && checkPw && checkName){
                        btn_signUp.isEnabled = true
                    }
                }
            } //id 변경후
        })
        pw.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            } //pw 변경전

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            } //pw 변경중

            override fun afterTextChanged(s: Editable?) {
                if (!s.isNullOrEmpty()){
                    checkPw = true
                    if(checkId && checkPw && checkName){
                        btn_signUp.isEnabled = true
                    }
                }
            } //pw 변경후
        })
        name.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            } //name 변경전

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            } //name 변경중

            override fun afterTextChanged(s: Editable?) {
                if (!s.isNullOrEmpty()){
                    checkName = true
                    if(checkId && checkPw && checkName){
                        btn_signUp.isEnabled = true
                    }
                }
            } //name 변경후
        })

        btn_signUp.setOnClickListener {
            if (checkId && checkPw && checkName) {
                Toast.makeText(this@SignUpActivity,"회원가입이 완료되었습니다", Toast.LENGTH_SHORT).show()
                intent = Intent(this@SignUpActivity, SignInActivity::class.java).apply{
                    putExtra("idFromSignUp", id.text.toString())
                    putExtra("pwFromSignUp", pw.text.toString())
                }
                setResult(RESULT_OK, intent)
                if (!isFinishing) finish()
            } else {
                Toast.makeText(this@SignUpActivity, "입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
            }
        }

    }
}