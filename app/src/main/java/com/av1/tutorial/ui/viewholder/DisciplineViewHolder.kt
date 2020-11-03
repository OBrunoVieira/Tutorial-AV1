package com.av1.tutorial.ui.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.models.Discipline
import kotlinx.android.synthetic.main.vh_discipline.view.*

class DisciplineViewHolder(itemView: View, val listener: OnDisciplineClickListener? = null) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {

    init {
        itemView.setOnClickListener(this)
    }

    fun bind(discipline: Discipline) {
        itemView.run {
            discipline_text_view_title.text = discipline.name
            discipline_text_view_exam_grade.text = discipline.exam.grade.toString()
            discipline_text_view_aps_grade.text = discipline.exam.aps.toString()
            discipline_text_view_exam.text =
                (discipline.exam.grade ?: 0f + (discipline.exam.aps ?: 0f)).toString()
        }
    }

    interface OnDisciplineClickListener {
        fun onDisciplineClick(position: Int)
    }

    override fun onClick(v: View?) {
        listener?.onDisciplineClick(bindingAdapterPosition)
    }
}