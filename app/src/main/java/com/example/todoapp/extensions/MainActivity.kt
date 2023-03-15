package com.example.todoapp.extensions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todoapp.FragmentThree
import com.example.todoapp.R
import com.example.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.profile -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, OneFragment())
                        .commit()
                    true
                }
                    R.id.profile -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, TwoFragment())
                            .commit()
                        true
                }
                    R.id.profile -> {
                       supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, FragmentThree())
                        .commit()
                        true
                }


                else-> {
                    true
                }
            }
        }


    }
}