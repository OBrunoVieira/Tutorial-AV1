package com.av1.tutorial.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.av1.tutorial.R
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.adapter.diff.DisciplineDiffUtils
import com.av1.tutorial.ui.viewholder.DisciplineViewHolder

class DisciplineAdapter(val listener: DisciplineViewHolder.OnDisciplineClickListener) :
    ListAdapter<Discipline, DisciplineViewHolder>(DisciplineDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DisciplineViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.vh_discipline, parent, false),
        listener

    )

    override fun onBindViewHolder(holder: DisciplineViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}