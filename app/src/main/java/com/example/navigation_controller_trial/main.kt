package com.example.navigation_controller_trial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [main.newInstance] factory method to
 * create an instance of this fragment.
 */

class main : Fragment() , View.OnClickListener{


//using lateinit keyword for the initializing the variable navcontroller
//lateinit keyword is use dfor late initialization of keywords

        private lateinit var navController:NavController


//-----------------------------------------------------------------------------------------------

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
//-----------------------------------------------------------------------------------------------

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //now this fragment_main is used in our navigation graph .
        //so here below  after passing view parameter to the below code
        // it'll (android) automatically connect the our Navigation_graph and this nav controller obj
        //means below navController have reference to the navigation_graph cause this .kt file have a
        // relationship with fragment_main file whichc is used in navigation_controller file i.e in graph
        // this graph is now aautomatically gets connected with the below navcontroller obj

            navController =Navigation.findNavController(view)


        view.findViewById<Button>(R.id.btn_fragment_a).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_fragment_b).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_fragment_c).setOnClickListener(this)



    }
//-----------------------------------------------------------------------------------------------

    override fun onClick(v: View?)

    {
            when(v!!.id)
            {
                    R.id.btn_fragment_a ->  navController!!.navigate(R.id.action_main_to_a)
                    R.id.btn_fragment_b ->  navController!!.navigate(R.id.action_main_to_b)
                    R.id.btn_fragment_c ->  navController!!.navigate(R.id.action_main_to_c)
            }

    }



//-----------------------------------------------------------------------------------------------




}