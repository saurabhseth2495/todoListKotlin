package com.example.todolistkotlin

import android.icu.text.CaseMap

//data keyword is use with class where we don't write any logic, purpose to hold the data.
data class Todo(
    val title: String,
    var isChecked: Boolean = false
)