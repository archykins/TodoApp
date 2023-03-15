package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.todoapp.databinding.ActivityRegistrationBinding
import com.example.todoapp.extensions.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.materialButtonRegister.setOnClickListener {
            val fullname = validateFullname(binding.textInputEditEFullname.text)
            val emailer = validateMy(binding.textInputEditEnterEmail.text)
            val passer = validatePass(binding.textEditEnterpass.text)
            val confirmer = validateConfirm(binding.textEditEnterpass, binding.textEditConfirmpass)


            binding.textInputLayoutFullname.error = fullname
            binding.textLayoutEnterEmail.error = emailer
            binding.textInputLayoutEnterpass.error = passer
            binding.textInputLayoutConfirmpass.error = confirmer
            if (emailer == null && passer == null && fullname == null && confirmer == null) {
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                binding.materialButtonRegister.setOnClickListener{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }

            }
        }

        binding.textViewSingup.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


    }
}