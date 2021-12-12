package com.codeinger.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codeinger.navigationcomponentex.databinding.FragmentChooseReceiverBinding


class ChooseReceiverFragment : Fragment(){

    private lateinit var binding : FragmentChooseReceiverBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentChooseReceiverBinding.inflate(layoutInflater)

        return binding.root
    }

}