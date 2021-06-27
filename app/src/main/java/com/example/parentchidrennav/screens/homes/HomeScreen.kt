package com.example.parentchidrennav.screens.homes

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.parentchidrennav.R
import kotlinx.android.synthetic.main.fragment_home_screen.*

class HomeScreen : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        tvNavToCounter.setOnClickListener(this)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeScreen()
    }

    override fun onClick(v: View?) {
        when (v) {
            tvNavToCounter -> this.findNavController().navigate(R.id.toCounterScreen)
        }
    }
}