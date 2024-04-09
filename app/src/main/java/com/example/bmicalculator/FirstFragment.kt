package com.example.bmicalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("FirstFragment","onCreate")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backButton = view.findViewById<Button>(R.id.btn_back)
        backButton.setOnClickListener {
            requireActivity().finish()
        }
    }

    //define the layout of FirstFragment to fragment_first
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("FirstFragment","onCreateView")

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("FirstFragment","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("FirstFragment","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("FirstFragment","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("FirstFragment","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("FirstFragment","onDetach")
    }

}