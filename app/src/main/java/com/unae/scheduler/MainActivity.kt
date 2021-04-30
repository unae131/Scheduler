package com.unae.scheduler

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unae.scheduler.databinding.ActivityMainBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
//    private var toDoDb : ToDoDB? = null
//    private var toDoList = listOf<ToDo>()

    private  var toDoList: List<ToDo> = listOf(
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

//        toDoDb = ToDoDB.getInstance(this)
//
//        val r = Runnable {
//            toDoList = toDoDb?.toDoDao()?.getAll()!!
//        }
//
//        val thread = Thread(r)
//        thread.start()

        var dateTimeFormatter = DateTimeFormatter.ofPattern("M월 d일 E").withLocale(Locale.forLanguageTag("ko"))
        binding.mainTvDate.text = LocalDate.now().format(dateTimeFormatter)

        val adapter = ToDoListAdapter(toDoList)
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        binding.mRecyclerView.adapter = adapter
    }
}