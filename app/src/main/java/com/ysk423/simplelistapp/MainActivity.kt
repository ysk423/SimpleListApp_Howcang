package com.ysk423.simplelistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //viewの取得
        val lv: ListView = findViewById(R.id.lv)
        val data = arrayOf(
                "ライオン","クマ","キリン","ゾウ","パンダ","コアラ","キリン","サル","ヒョウ",
                "ゴリラ","カバ","カピバラ","リス","ワニ","ハムスター","ヒツジ","ネコ"
        )

        //アダプター
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                data
        )

        //アダプターをListViewにセット
        lv.adapter = adapter

        //アイテムがクリックされたらトースト
        lv.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, data[i], Toast.LENGTH_SHORT).show()
        }

    }
}