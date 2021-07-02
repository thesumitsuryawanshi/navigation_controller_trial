package com.example.navigation_controller_trial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast

//below import is for view binding
import com.example.navigation_controller_trial.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


//---------------------------------------------------------------------------------------------------------

        binding.btnTemp.setOnClickListener()
        {
            Toast.makeText(applicationContext, "temp msg", Toast.LENGTH_SHORT).show()
        }

//---------------------------------------------------------------------------------------------------------
    }


}