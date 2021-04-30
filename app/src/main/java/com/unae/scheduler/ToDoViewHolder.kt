package com.unae.scheduler

import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.unae.scheduler.databinding.ActivityMainBinding
import com.unae.scheduler.databinding.ItemTodoBinding

class ToDoViewHolder(private val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun bind(item: ToDo) {
        binding.apply {
            todoTvFrom.text = item.fromDateTime.toLocalDate().toString()
            todoTvTo.text = item.toDateTime.toLocalDate().toString()
            todoTvTitle.text = item.title
        }
    }
}