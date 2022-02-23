package com.example.lessonsqlitekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.lessonsqlitekotlin.db.MyDBManager

class MainActivity : AppCompatActivity() {

    val myDBManager = MyDBManager(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun onClickSave(view: View) {
        val edTitle = findViewById<TextView>(R.id.edTitle)
        val edContent = findViewById<TextView>(R.id.edContent)
        val tvTest = findViewById<TextView>(R.id.tvTest)
        tvTest.text = ""
        myDBManager.openDB()
        myDBManager.insertToDB(edTitle.text.toString(), edContent.text.toString())
        val dataList = myDBManager.readDBData()
            for (item in dataList) {
                tvTest.append(item)
                tvTest.append("\n")

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        myDBManager.CloseDB()
    }
}

