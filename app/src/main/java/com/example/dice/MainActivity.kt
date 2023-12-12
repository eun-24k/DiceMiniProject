package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_num = findViewById<TextView>(R.id.tv_number)
        val btn_dice = findViewById<Button>(R.id.btn_roll)

        btn_dice.setOnClickListener {
            //1~6까지 랜덤 숫자를 얻는다.
            val random = Random()
            val num = random.nextInt(6) + 1 // 랜덤에서 들어오는 숫자기 0부터 시작이라 1에서 6까지의 값을 가져오려면 1을 더해주어야함.

            // TextView에 표시한다.
            tv_num.text = num.toString()
        }
    }
}