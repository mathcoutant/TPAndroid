package com.tp.mathieucoutant.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.tp.mathieucoutant.R

class TaskListAdapter : RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>() {

    var currentList: List<Task> = emptyList()

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTitle = itemView.findViewById<TextView>(R.id.task_title)
        val textViewDescription = itemView.findViewById<TextView>(R.id.task_description)
        fun bind(task: Task) {
            textViewTitle.text = task.title
            textViewDescription.text = task.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}