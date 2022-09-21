package com.example.myapplication

import android.app.role.RoleManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = viewBinding(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }


    }











