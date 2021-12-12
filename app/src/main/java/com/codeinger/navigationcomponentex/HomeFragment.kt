package com.codeinger.navigationcomponentex

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.codeinger.navigationcomponentex.R
import com.codeinger.navigationcomponentex.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){

    private lateinit var binding : FragmentHomeBinding
    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        init()
        setupOnClickListeners()
        return binding.root
    }

    private fun init() {
        navController = findNavController()
    }

    private fun setupOnClickListeners() {
        binding.btnSendMoney.setOnClickListener {
            //navigate with id
            val navOption = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()

            navController.navigate(R.id.chooseReceiverFragment,null,navOption)
        }

        binding.btnViewBalance.setOnClickListener {
            //navigate with action id
            navController.navigate(R.id.action_homeFragment_to_viewBalanceFragment)
        }

        binding.btnTransactions.setOnClickListener {
            //navigate with direction object
            val actionHomeFragmentToViewTransactions = HomeFragmentDirections.actionHomeFragmentToViewTransactionsFragment()
            navController.navigate(actionHomeFragmentToViewTransactions)
        }
    }

}