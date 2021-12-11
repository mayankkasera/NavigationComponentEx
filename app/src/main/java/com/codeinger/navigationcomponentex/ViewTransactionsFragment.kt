package com.codeinger.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeinger.navigationcomponentex.R
import com.codeinger.navigationcomponentex.databinding.FragmentViewBalanceBinding
import com.codeinger.navigationcomponentex.databinding.FragmentViewTransactionsBinding

class ViewTransactionsFragment : Fragment(){

    private lateinit var binding : FragmentViewTransactionsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentViewTransactionsBinding.inflate(layoutInflater)

        return binding.root
    }

}