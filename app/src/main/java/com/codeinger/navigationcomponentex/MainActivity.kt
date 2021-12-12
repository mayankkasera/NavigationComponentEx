package com.codeinger.navigationcomponentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeinger.navigationcomponentex.R
import com.codeinger.navigationcomponentex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}