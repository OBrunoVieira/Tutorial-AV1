package com.av1.tutorial.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.av1.tutorial.R
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.ui.adapter.diff.AvDiffUtils
import com.av1.tutorial.ui.viewholder.Av1SectionViewHolder
import com.av1.tutorial.ui.viewholder.Av2SectionViewHolder
import com.av1.tutorial.ui.viewholder.Av3SectionViewHolder

class Av3SectionAdapter : RecyclerView.Adapter<Av3SectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        Av3SectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vh_av3, parent, false)
        )

    override fun onBindViewHolder(holder: Av3SectionViewHolder, position: Int) {

    }

    override fun getItemCount() = 1
}