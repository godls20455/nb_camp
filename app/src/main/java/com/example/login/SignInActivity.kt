package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignInActivity : AppCompatActivity() {
    private lateinit var Lancher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val id = findViewById<EditText>(R.id.et_id) //id 넘기기
        val pw = findViewById<EditText>(R.id.et_pw) //pw 넘기기
        val btn_login = findViewById<Button>(R.id.btn_login) //로그인 버튼 연결
        val btn_join = findViewById<Button>(R.id.btn_join) //회원가입 버튼 연결

        var checkId = false
        var checkPw = false

        btn_login.isEnabled = false

        id.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            } //id 변경전

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            } //id 변경중

            override fun afterTextChanged(s: Editable?) {
                if(!s.isNullOrEmpty()){ //s로 해도 되나유
                    checkId = true
                    if (checkId&&checkPw){
                        btn_login.isEnabled = true
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
                if(!s.isNullOrEmpty()){
                    checkPw = true
                    if (checkId&&checkPw){
                        btn_login.isEnabled = true
                    }
                }
            } //pw 변경후
        })

        btn_login.setOnClickListener { //로그인 버튼 연결
            if (checkId&&checkPw) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("id", id.text)
                Toast.makeText(this@SignInActivity, "로그인 성공", Toast.LENGTH_SHORT).show()
                intent.putExtra("saveId", id.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this@SignInActivity, "아이디와 비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            }
        }

        btn_join.setOnClickListener { //회원가입 버튼 연결
            intent = Intent(this, SignUpActivity::class.java)
            Lancher.launch(intent)
        }

        Lancher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {result ->
            if(result.resultCode == RESULT_OK){
                val receiveId = result.data?.getStringExtra("idFromSignUp")
                val receivedPw = result.data?.getStringExtra("pwFromSignUp")
                id.setText(receiveId)
                id.setText(receivedPw)
            }
        }

    }
}

