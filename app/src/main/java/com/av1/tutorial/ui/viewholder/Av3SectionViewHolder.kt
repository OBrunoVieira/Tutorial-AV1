package com.av1.tutorial.ui.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.adapter.DisciplineAdapter
import kotlinx.android.synthetic.main.vh_av3.view.*

class Av3SectionViewHolder(
    itemView: View,
    listener: DisciplineViewHolder.OnDisciplineClickListener,
    evaluationListener: View.OnClickListener
) : RecyclerView.ViewHolder(itemView) {
    private val adapter by lazy { DisciplineAdapter(listener) }

    var list: List<Discipline>? = null

    init {
        itemView.av3_image_view_add.setOnClickListener(evaluationListener)
    }

    fun bind(list: List<Discipline>) {
        itemView.av3_recycler_view.adapter = adapter
        adapter.submitList(list)
    }
}