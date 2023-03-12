package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var seekBar: SeekBar
    private lateinit var textViewProgress: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar = findViewById(R.id.seekBar)
        textViewProgress = findViewById(R.id.textView)

        seekBar.setOnSeekBarChangeListener(object :
            OnSeekBarChangeListener {  //Implementing the seekbar interface
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                Toast.makeText(this@MainActivity, "OnProgressChanged", Toast.LENGTH_SHORT).show()
                textViewProgress.text= "Rating ="+seekBar.progress.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivity, "OnStart", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                Toast.makeText(this@MainActivity, "OnStopTrackingTouch", Toast.LENGTH_SHORT).show()
                textViewProgress.text= "Final Rating ="+p0!!.progress.toString()
            }


        })


    }
}