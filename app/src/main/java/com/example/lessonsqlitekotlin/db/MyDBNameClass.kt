package com.example.lessonsqlitekotlin.db

import android.provider.BaseColumns


// https://developer.android.com/training/data-storage/sqlite#kotlin  - инструкция
// object MyDBNameClass : BaseColumns { при такой организации BaseColumns не нужен

object MyDBNameClass {
    const val TABLE_NAME = "my_table"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_CONTENT = "content"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "MyLessonDB.db"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXIST $TABLE_NAME (" +
    "${BaseColumns._ID} INTEGER PRIMARY KEY," +
    "$COLUMN_NAME_TITLE TEXT," +
    "$COLUMN_NAME_CONTENT TEXT)"

    const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS $TABLE_NAME"
}