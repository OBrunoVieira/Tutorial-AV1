package com.av1.tutorial.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.R
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.viewholder.Av3SectionViewHolder
import com.av1.tutorial.ui.viewholder.DisciplineViewHolder
import com.av1.tutorial.ui.viewholder.OnEvaluationClickListener

class Av3SectionAdapter(
    val listener: DisciplineViewHolder.OnDisciplineClickListener,
    var createDisciplineListener: View.OnClickListener
) : RecyclerView.Adapter<Av3SectionViewHolder>() {

    var list: List<Discipline> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        Av3SectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vh_av3, parent, false),
            listener,
            createDisciplineListener
        )

    override fun onBindViewHolder(holder: Av3SectionViewHolder, position: Int) {
        holder.bind(list)
    }

    override fun getItemCount() = 1
}