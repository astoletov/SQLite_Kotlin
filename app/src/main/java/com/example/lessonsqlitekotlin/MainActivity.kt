package com.example.lessonsqlitekotlin

import android.content.Intent
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

    override fun onResume() {
        super.onResume()
        myDBManager.openDB()
    }


    fun onClickNew(view: View) {
        val intent = Intent(this, EditActivity::class.java)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        myDBManager.closeDB()
    }
}

