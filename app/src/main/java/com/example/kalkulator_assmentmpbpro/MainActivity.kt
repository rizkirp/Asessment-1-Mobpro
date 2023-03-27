package com.example.kalkulator_assmentmpbpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulator_assmentmpbpro.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var firstNumber = 0
        var secondNumber = 0
        var operator = ""

        binding.btn0.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "0"
        }

        binding.btn1.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "1"
        }

        binding.btn2.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "2"
        }

        binding.btn3.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "3"
        }

        binding.btn4.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "4"
        }

        binding.btn5.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "5"
        }

        binding.btn6.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "6"
        }

        binding.btn7.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "7"
        }

        binding.btn8.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "8"
        }

        binding.btn9.setOnClickListener {
            binding.tvResult.text = binding.tvResult.text.toString() + "9"
        }

        binding.btnPlus.setOnClickListener {
            firstNumber = binding.tvResult.text.toString().toInt()
            operator = "+"
            binding.tvResult.text = ""
        }

        binding.btnSub.setOnClickListener {
            firstNumber = binding.tvResult.text.toString().toInt()
            operator = "-"
            binding.tvResult.text = ""
        }

        binding.btnTime.setOnClickListener {
            firstNumber = binding.tvResult.text.toString().toInt()
            operator = "X"
            binding.tvResult.text = ""
        }
        binding.btnDiv.setOnClickListener {
            firstNumber = binding.tvResult.text.toString().toDouble().toInt()
            operator = "/"
            binding.tvResult.text = ""
        }

        binding.btnResult.setOnClickListener {
            secondNumber = binding.tvResult.text.toString().toDouble().toInt()
            when (operator) {
                "+" -> binding.tvResult.text = (firstNumber + secondNumber).toString()
                "-" -> binding.tvResult.text = (firstNumber - secondNumber).toString()
                "X" -> binding.tvResult.text = (firstNumber * secondNumber).toString()
                "/" -> binding.tvResult.text = (firstNumber / secondNumber).toString()
            }
        }

        binding.btnClear.setOnClickListener {
            binding.tvResult.text = ""
            firstNumber = 0
            secondNumber = 0
            operator = ""
        }
    }
}
