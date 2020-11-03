package com.av1.tutorial.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.R
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.viewholder.Av1SectionViewHolder
import com.av1.tutorial.ui.viewholder.DisciplineViewHolder

class Av1SectionAdapter(val listener: DisciplineViewHolder.OnDisciplineClickListener,
                        var createDisciplineListener: View.OnClickListener
) :
    RecyclerView.Adapter<Av1SectionViewHolder>() {

    var list: List<Discipline> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        Av1SectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vh_av1, parent, false),
            listener,
            createDisciplineListener
        )

    override fun onBindViewHolder(holder: Av1SectionViewHolder, position: Int) {
        holder.bind(list)
    }

    override fun getItemCount() = 1
}