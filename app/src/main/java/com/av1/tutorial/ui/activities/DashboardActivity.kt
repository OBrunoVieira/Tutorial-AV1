package com.av1.tutorial.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import com.av1.tutorial.R
import com.av1.tutorial.ui.adapter.Av1SectionAdapter
import com.av1.tutorial.ui.adapter.Av2SectionAdapter
import com.av1.tutorial.ui.adapter.Av3SectionAdapter
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(R.layout.activity_dashboard) {

    private val av1SectionAdapter by lazy { Av1SectionAdapter() }
    private val av2SectionAdapter by lazy { Av2SectionAdapter() }
    private val av3SectionAdapter by lazy { Av3SectionAdapter() }

    private val concatAdapter by lazy {
        ConcatAdapter(
            av1SectionAdapter,
            av2SectionAdapter,
            av3SectionAdapter
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dashboard_recycler_view.adapter = concatAdapter
    }
}