// src/your/package/name/MainActivity.kt

package com.daman.myapplication
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.view.Gravity
import com.daman.task_4.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)

        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Alert Dialog Title")
            .setMessage("Alert Dialog Message")
            .setCancelable(false) // Make the dialog non-dismissible on outside click

            .setPositiveButton("Positive") { _, _ ->
                // Handle positive button click
                textView.text = "Positive button is pressed"
            }

            .setNegativeButton("Negative") { _, _ ->
                // Handle negative button click
                textView.text = "Negative button is pressed"
            }

            .setNeutralButton("Neutral") { _, _ ->
                // Handle neutral button click
                textView.text = "Neutral button is pressed"
            }

            .create()

        alertDialog.show()

        // Set the dialog to appear at the bottom of the screen
        val layoutParams = alertDialog.window?.attributes
        layoutParams?.gravity = Gravity.BOTTOM
        alertDialog.window?.attributes = layoutParams
    }
}
