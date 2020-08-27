package com.amary.cleanarchsample.persetation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.amary.cleanarchsample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory =  MainViewModelFactory.getInstance()
        val viewModel : MainViewModel by viewModels { factory }

        viewModel.setName("Dicoding")
        viewModel.message.observe(this, Observer {
            tv_welcome.text = it.welcomeMessage
        })
    }
}