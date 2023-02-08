package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import com.example.todoapp.databinding.ActivityLoginBinding
import com.example.todoapp.extensions.validateMy
import com.example.todoapp.extensions.validatePass
import android.content.Intent as Intent

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.materialButtonSingin.setOnClickListener{
        val emailer = validateMy(binding.textInputEditEnterEmail.text)
        val passer = validatePass(binding.textInputEditEnterPass.text)

            binding.textInputLayoutEnterEmail.error = emailer
            binding.textInputLayoutEnterPass.error= passer
            if (emailer==null && passer==null){
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.textViewSingup.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.textViewDontHave.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }

        }
    }
