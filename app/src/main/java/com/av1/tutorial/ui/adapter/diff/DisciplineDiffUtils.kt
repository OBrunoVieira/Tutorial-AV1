package com.av1.tutorial.ui.adapter.diff

import androidx.recyclerview.widget.DiffUtil
import com.av1.tutorial.models.Discipline

class DisciplineDiffUtils : DiffUtil.ItemCallback<Discipline>() {
    override fun areItemsTheSame(oldItem: Discipline, newItem: Discipline) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Discipline, newItem: Discipline) =
        oldItem == newItem
}