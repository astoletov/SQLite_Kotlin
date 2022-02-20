package com.example.lessonsqlitekotlin.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import java.util.ArrayList

class MyDBManager(context: Context) {

    private val MyDBHelper = MyDBHelper(context)

    private var db: SQLiteDatabase? = null

    fun openDB() {
      db = MyDBHelper.writableDatabase
    }

    fun insertToDB (title: String, content: String ) {
        val values = ContentValues().apply {
            put(MyDBNameClass.COLUMN_NAME_TITLE, title)
            put(MyDBNameClass.COLUMN_NAME_CONTENT, content)
        }
        db?.insert(MyDBNameClass.TABLE_NAME, null, values)
    }

    fun readDBData() : ArrayList<String> {
        val dataList = ArrayList<String>()
        val cursor = db?.query(MyDBNameClass.TABLE_NAME, null, null, null, null, null, null)

        with(cursor) {
            while (this?.moveToNext()!!) {
                val dataText= cursor?.getString(cursor.getColumnIndex(MyDBNameClass.COLUMN_NAME_TITLE))
                dataList.add(dataText.toString())
            }
        }


        return dataList
    }

}