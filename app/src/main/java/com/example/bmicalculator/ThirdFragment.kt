package com.example.bmicalculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("ThirdFragment","onCreate")
    }
    //define the layout of ThirdFragment to fragment_third
    override fun onCreateView(inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.e("ThirdFragment","onCreateView")
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backButton = view.findViewById<Button>(R.id.btn_back3)
        backButton.setOnClickListener {
            requireActivity().finish()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("ThirdFragment","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("ThirdFragment","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("ThirdFragment","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("ThirdFragment","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("ThirdFragment","onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("ThirdFragment","onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("ThirdFragment","onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("ThirdFragment","onDetach")
    }

}