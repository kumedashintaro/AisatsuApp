package com.example.aisatsuapp

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.util.Log
import android.view.View
import android.widget.DatePicker
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
        }

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")

                if (hour >= 2 && hour <=9 && minute >= 0) {
                    textView.text = "おはようございます"

                }else if (hour >= 10 && hour <=17 && minute >= 0) {
                textView.text = "こんにちは"

                }else if (hour >= 18 || hour == 1 && minute >= 0) {
                    textView.text = "こんばんは"
                }

            },
            13, 0, true
        )
        timePickerDialog.show()




    }
}

