package com.example.todolistkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var recycle_view: RecyclerView
private lateinit var todoAdapter: TodoAdapter
private lateinit var add_todo: Button
private lateinit var delete_todo: Button
private lateinit var todo_title: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todo_title = findViewById(R.id.todo_title)
        add_todo = findViewById(R.id.add_todo)
        delete_todo = findViewById(R.id.delete_todo)
        todoAdapter = TodoAdapter(mutableListOf())
        recycle_view = findViewById(R.id.recycle_view)
        recycle_view.adapter = todoAdapter
        recycle_view.layoutManager = LinearLayoutManager(this)
        add_todo.setOnClickListener(View.OnClickListener {
            if (!todo_title.text.isEmpty()) {
                todoAdapter.addTodo(Todo(todo_title.text.toString(), false))
                todo_title.text.clear()
            } else {

            }
        })
        delete_todo.setOnClickListener(View.OnClickListener {
            todoAdapter.deleteTodo()
        })
    }
}