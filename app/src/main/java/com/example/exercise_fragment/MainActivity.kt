package com.example.exercise_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.exercise_fragment.CounterFragment
import com.example.exercise_fragment.CounterShowFragment
import kotlinx.android.synthetic.main.fragment_counter.*
import kotlinx.android.synthetic.main.fragment_counter_show.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    var value:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decrement_btn.setOnClickListener(this)
        increment_btn.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when(v){
            decrement_btn -> decrement()
            increment_btn -> increment()
        }
    }
    fun decrement(){
        this.value -= 1
        var viewIncrement=this.value.toString()
        counterShowText.text = viewIncrement
    }
    fun increment(){
        this.value += 1
        var viewDecrement=this.value.toString()
        counterShowText.text = viewDecrement
    }
}


