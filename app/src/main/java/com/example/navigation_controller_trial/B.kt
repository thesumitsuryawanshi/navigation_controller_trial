package com.example.navigation_controller_trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

//below req for navigation graph and navigation controller
import androidx.navigation.NavController
import androidx.navigation.Navigation

//for view binding
import com.example.navigation_controller_trial.databinding.FragmentBBinding


class B : Fragment() {


    private lateinit var  navController:NavController

    private lateinit var binding: FragmentBBinding




//--------------------------------------------------------------------------------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

//--------------------------------------------------------------------------------------------------------------------
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?

    {
        // Inflate the layout for this fragment

        binding= FragmentBBinding.inflate(layoutInflater)
        return binding.root
    }

//--------------------------------------------------------------------------------------------------

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //never forget to bind the navcontroller obj with the view
        navController = Navigation.findNavController(view)

        binding.B1.setOnClickListener()
        {
            Toast.makeText(context, "heading towards the fragment B_1", Toast.LENGTH_SHORT).show()
            navController.navigate(R.id.action_b_to_fragment_b_1)
        }


    }

}