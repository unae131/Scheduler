package com.unae.scheduler

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unae.scheduler.databinding.ActivityMainBinding

@RequiresApi(Build.VERSION_CODES.O)
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val toDoList: List<ToDo> = listOf(
            ToDo("A"),
            ToDo("B"),
            ToDo("C"),
            ToDo("A"),
            ToDo("B"),
            ToDo("C"),
            ToDo("A"),
            ToDo("B"),
            ToDo("C"),
            ToDo("A"),
            ToDo("B"),
            ToDo("C")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = ToDoListAdapter(toDoList)
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.mRecyclerView.adapter = adapter
    }
}