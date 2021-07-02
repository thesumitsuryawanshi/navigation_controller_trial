package com.example.navigation_controller_trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class B : Fragment() , View.OnClickListener{


    private lateinit var  navController:NavController


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
        return inflater.inflate(R.layout.fragment_b, container, false)

    }

//--------------------------------------------------------------------------------------------------------------------

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //never forget to bind the navcontroller obj with the view
        navController = Navigation.findNavController(view)

        //now after clicking this button will  will send user from fragment b to fragment b-1
            view.findViewById<Button>(R.id.btn_fragment_b_1).setOnClickListener(this)

    }

//--------------------------------------------------------------------------------------------------------------------

    override fun onClick(v: View?) {

        when(v!!.id)
        {
                R.id.btn_fragment_b_1 -> navController.navigate(R.id.action_b_to_fragment_b_1)
        }

    }


}