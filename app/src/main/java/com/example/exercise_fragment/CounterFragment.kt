package com.example.exercise_fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.ListFragment
import kotlinx.android.synthetic.main.fragment_counter.*

/**
 * A simple [Fragment] subclass.
 * Use the [CounterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CounterFragment : Fragment() {

    val counterFragment = "COUNTER FRAGMENT"

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        println("$counterFragment ON ATTACH")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("$counterFragment ON CREATE")
//        decrement_btn.setOnClickListener(this)
//        increment_btn.setOnClickListener(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("$counterFragment ON CREATE VIEW")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }
//    override fun onClick(v: View?) {
//        when(v){
//            decrement_btn -> decrement()
//            increment_btn -> increment()
//        }
//    }
//    fun decrement(){
//
//    }
//    fun increment(){
//
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        println("$counterFragment ON ACTIVITY CREATED")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        println("$counterFragment ON START")
//    }
//    override fun onResume() {
//        super.onResume()
//        println("$counterFragment ON RESUME")
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        println("$counterFragment ON PAUSE")
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//        println("$counterFragment ON STOP")
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        println("$counterFragment ON DESTROY VIEW")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        println("$counterFragment ON DESTROY")
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        println("$counterFragment ON DETACH")
//    }

}