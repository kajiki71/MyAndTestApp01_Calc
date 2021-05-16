package com.example.mycalcandroidapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android .widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcLinear:AppCompatActivity(){

    //onCreateは今は呪文のように唱えよう。
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //アクティビティにレイアウトを設定
        setContentView(R.layout.calc_linear)

        //XML定義ファイルのビューを取得
        val editText1 = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)


        //ボタンクリック時の処理
        //Addボタン　加算処理
        button1.setOnClickListener {
            textView.text=(editText1.text.toString().toInt()+
                    editText2.text.toString().toInt()).toString()
        }
        //Subボタン　減算
        button2.setOnClickListener {
            textView.text=(editText1.text.toString().toInt()-
                    editText2.text.toString().toInt()).toString()
        }


    }
}