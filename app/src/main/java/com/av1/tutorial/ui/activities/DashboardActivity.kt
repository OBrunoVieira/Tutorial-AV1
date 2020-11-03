package com.av1.tutorial.ui.activities

import android.content.Intent
import android.location.GnssAntennaInfo
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import com.av1.tutorial.R
import com.av1.tutorial.models.Discipline
import com.av1.tutorial.models.Exam
import com.av1.tutorial.ui.activities.RegisterDisciplineActivity.Companion.EXTRA_APS_GRADE
import com.av1.tutorial.ui.activities.RegisterDisciplineActivity.Companion.EXTRA_EXAM_GRADE
import com.av1.tutorial.ui.activities.RegisterDisciplineActivity.Companion.EXTRA_EXAM_LEVEL
import com.av1.tutorial.ui.activities.RegisterDisciplineActivity.Companion.EXTRA_TITLE
import com.av1.tutorial.ui.adapter.Av1SectionAdapter
import com.av1.tutorial.ui.adapter.Av2SectionAdapter
import com.av1.tutorial.ui.adapter.Av3SectionAdapter
import com.av1.tutorial.ui.viewholder.DisciplineViewHolder
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(R.layout.activity_dashboard) {

    private val av1SectionAdapter: Av1SectionAdapter by lazy {
        Av1SectionAdapter(
            av1ClickListener(),
            av1RegisterListener()
        )
    }
    private val av2SectionAdapter: Av2SectionAdapter by lazy {
        Av2SectionAdapter(
            av2ClickListener(),
            av2RegisterListener()
        )
    }
    private val av3SectionAdapter: Av3SectionAdapter by lazy {
        Av3SectionAdapter(
            av3ClickListener(),
            av3RegisterListener()
        )
    }

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

        av1SectionAdapter.createDisciplineListener = av1RegisterListener()

        av2SectionAdapter.createDisciplineListener = av2RegisterListener()

        av3SectionAdapter.createDisciplineListener = av3RegisterListener()

        av1SectionAdapter.list = listOf(
            Discipline("", "Fotografia", Exam(8f, 2f)),
            Discipline("", "Semiótica", Exam(7.5f, 2f)),
            Discipline("", "Cálculo I", Exam(3f, 1f)),
            Discipline("", "Web Design", Exam(1f, 1.4f)),
            Discipline("", "Projeto de Comunicação Digital", Exam(7f, 1f)),
            Discipline("", "Embalagem", Exam(4f, 2f)),
            Discipline("", "Projeto de Identidade Visual", Exam(4f, 2f)),
            Discipline("", "Física I", Exam(8f, .4f))
        )

        av2SectionAdapter.list = listOf(
            Discipline("", "Fotografia", Exam(8f, 2f)),
            Discipline("", "Semiótica", Exam(7.5f, 2f)),
            Discipline("", "Cálculo I", Exam(3f, 1f)),
            Discipline("", "Web Design", Exam(1f, 1.4f)),
            Discipline("", "Projeto de Comunicação Digital", Exam(7f, 1f)),
            Discipline("", "Embalagem", Exam(4f, 2f)),
            Discipline("", "Projeto de Identidade Visual", Exam(4f, 2f)),
            Discipline("", "Física I", Exam(8f, .4f))
        )

        av3SectionAdapter.list = listOf(
            Discipline("", "Fotografia", Exam(8f, 2f)),
            Discipline("", "Semiótica", Exam(7.5f, 2f)),
            Discipline("", "Cálculo I", Exam(3f, 1f)),
            Discipline("", "Web Design", Exam(1f, 1.4f)),
            Discipline("", "Projeto de Comunicação Digital", Exam(7f, 1f)),
            Discipline("", "Embalagem", Exam(4f, 2f)),
            Discipline("", "Projeto de Identidade Visual", Exam(4f, 2f)),
            Discipline("", "Física I", Exam(8f, .4f))
        )
    }

    private fun av1ClickListener() = object : DisciplineViewHolder.OnDisciplineClickListener {
        override fun onDisciplineClick(position: Int) {
            startActivity(
                Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                    .putExtra(EXTRA_TITLE, av1SectionAdapter.list.get(position).name)
                    .putExtra(EXTRA_EXAM_GRADE, av1SectionAdapter.list.get(position).exam.grade)
                    .putExtra(EXTRA_APS_GRADE, av1SectionAdapter.list.get(position).exam.aps)
                    .putExtra(EXTRA_EXAM_LEVEL, "AV1")
            )
        }

    }

    private fun av2ClickListener() = object : DisciplineViewHolder.OnDisciplineClickListener {
        override fun onDisciplineClick(position: Int) {
            startActivity(
                Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                    .putExtra(EXTRA_TITLE, av2SectionAdapter.list.get(position).name)
                    .putExtra(EXTRA_EXAM_GRADE, av2SectionAdapter.list.get(position).exam.grade)
                    .putExtra(EXTRA_APS_GRADE, av2SectionAdapter.list.get(position).exam.aps)
                    .putExtra(EXTRA_EXAM_LEVEL, "AV2")
            )
        }

    }

    private fun av3ClickListener() = object : DisciplineViewHolder.OnDisciplineClickListener {
        override fun onDisciplineClick(position: Int) {
            startActivity(
                Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                    .putExtra(EXTRA_TITLE, av3SectionAdapter.list.get(position).name)
                    .putExtra(EXTRA_EXAM_GRADE, av3SectionAdapter.list.get(position).exam.grade)
                    .putExtra(EXTRA_APS_GRADE, av3SectionAdapter.list.get(position).exam.aps)
                    .putExtra(EXTRA_EXAM_LEVEL, "AV3")
            )
        }
    }

    private fun av1RegisterListener() = View.OnClickListener {
        startActivity(
            Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                .putExtra(EXTRA_EXAM_LEVEL, "AV1")
        )
    }

    private fun av2RegisterListener() = View.OnClickListener {
        startActivity(
            Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                .putExtra(EXTRA_EXAM_LEVEL, "AV2")
        )
    }

    private fun av3RegisterListener() = View.OnClickListener {
        startActivity(
            Intent(this@DashboardActivity, RegisterDisciplineActivity::class.java)
                .putExtra(EXTRA_EXAM_LEVEL, "AV3")
        )
    }

}