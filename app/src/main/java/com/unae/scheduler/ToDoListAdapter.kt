package com.unae.scheduler

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.unae.scheduler.databinding.ItemTodoBinding

class ToDoListAdapter(val itemList: List<ToDo>) : RecyclerView.Adapter<ToDoViewHolder>() {
    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val inflatedView = ItemTodoBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
        )
        return ToDoViewHolder(inflatedView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }
}