package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var list : List<String>
    var answer = ""
    var question = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when(view.id) {
            R.id.btn_equel -> {

            }
            R.id.btn_ac -> {
                tvOne.text = ""
                tvTwo.text = ""
            }
            R.id.btn_c -> {
                tvTwo.text = ""
                question = tvOne.text.substring(0, tvOne.text.toString().length - 1)
                tvOne.text = question
            }
            R.id.btn_multiply -> {
                tvOne.text = "*"
            }
            R.id.btn_dot -> {
                tvOne.text = "."
            }
            R.id.btn_plus -> {
                tvOne.text = "+"
            }
            R.id.btn_minus -> {
                tvOne.text = "-"
            }
            R.id.btn_extent -> {
                tvOne.text = "^"
            }
            R.id.btn_division -> {
                tvOne.text = "/"
            }
            else -> {
                question += (view as Button).text
                tvOne.text = question
            }
        }
    }
}