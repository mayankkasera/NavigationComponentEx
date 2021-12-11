package com.codeinger.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeinger.navigationcomponentex.R
import com.codeinger.navigationcomponentex.databinding.FragmentHomeBinding
import com.codeinger.navigationcomponentex.databinding.FragmentViewBalanceBinding

class ViewBalanceFragment : Fragment(){

    private lateinit var binding : FragmentViewBalanceBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewBalanceBinding.inflate(layoutInflater)

        return binding.root
    }

}