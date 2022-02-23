package com.example.lessonsqlitekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EditActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_activity)

    }

    fun addImage(view: View) {
        val myImageLayout = findViewById<ConstraintLayout>(R.id.myImageLayout)
        val fbAddImage = findViewById<FloatingActionButton>(R.id.fbAddImage)
        myImageLayout.visibility = View.VISIBLE
        fbAddImage.visibility = View.GONE
    }

    fun onClickDeleteImage(view: View) {
        val myImageLayout = findViewById<ConstraintLayout>(R.id.myImageLayout)
        val fbAddImage = findViewById<FloatingActionButton>(R.id.fbAddImage)
        myImageLayout.visibility = View.GONE
        fbAddImage.visibility = View.VISIBLE

    }
}