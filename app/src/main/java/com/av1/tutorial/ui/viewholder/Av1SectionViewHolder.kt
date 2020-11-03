package com.av1.tutorial.ui.viewholder

import android.content.DialogInterface
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.activities.RegisterDisciplineActivity
import com.av1.tutorial.ui.adapter.DisciplineAdapter
import kotlinx.android.synthetic.main.vh_av1.view.*

class Av1SectionViewHolder(
    itemView: View,
    listener: DisciplineViewHolder.OnDisciplineClickListener,
    evaluationListener: View.OnClickListener
) : RecyclerView.ViewHolder(itemView){

    val adapter by lazy { DisciplineAdapter(listener) }
    var list: List<Discipline>? = null

    init {
        itemView.av1_image_view_add.setOnClickListener(evaluationListener)
    }

    fun bind(list: List<Discipline>) {
        this.list = list
        itemView.av1_recycler_view.adapter = adapter
        adapter.submitList(list)
    }
}