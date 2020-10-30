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

class Av2SectionAdapter : RecyclerView.Adapter<Av2SectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        Av2SectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vh_av2, parent, false)
        )

    override fun onBindViewHolder(holder: Av2SectionViewHolder, position: Int) {

    }

    override fun getItemCount() = 1
}