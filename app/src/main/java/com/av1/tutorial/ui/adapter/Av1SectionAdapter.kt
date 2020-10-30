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

class Av1SectionAdapter : RecyclerView.Adapter<Av1SectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        Av1SectionViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.vh_av1, parent, false)
        )

    override fun onBindViewHolder(holder: Av1SectionViewHolder, position: Int) {

    }

    override fun getItemCount() = 1
}