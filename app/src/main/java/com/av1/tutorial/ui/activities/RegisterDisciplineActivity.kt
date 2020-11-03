package com.av1.tutorial.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.av1.tutorial.R
import kotlinx.android.synthetic.main.activity_register_discipline.*

class RegisterDisciplineActivity : AppCompatActivity(R.layout.activity_register_discipline) {
    companion object {
        const val EXTRA_TITLE = "EXTRA_TITLE"
        const val EXTRA_EXAM_GRADE = "EXTRA_EXAM_GRADE"
        const val EXTRA_APS_GRADE = "EXTRA_APS_GRADE"
        const val EXTRA_EXAM_LEVEL = "EXTRA_EXAM_LEVEL"

        const val AV1 = 1010
        const val AV2 = 2010
        const val AV3 = 3010
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intent.getStringExtra(EXTRA_TITLE)?.let { register_discipline_edit_text_title.setText(it) }
        intent.getStringExtra(EXTRA_EXAM_LEVEL)?.let { register_discipline_text_view_label.setText(it) }
        intent.getFloatExtra(EXTRA_EXAM_GRADE, -1f)?.takeIf { it >=0 }?.let { register_discipline_edit_text_grade.setText(it.toString()) }
        intent.getFloatExtra(EXTRA_APS_GRADE,-1f)?.takeIf { it >=0 }?.let { register_discipline_edit_text_aps.setText(it.toString()) }
    }
}