package com.packag.celebrityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var celebrityAdapter: CelebrityListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        celebrityAdapter = CelebrityListAdapter(this@MainActivity)

        celebtrityListView.adapter = celebrityAdapter
    }
}
