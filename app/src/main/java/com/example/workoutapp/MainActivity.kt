package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // View binding is a feature that makes it easier to write code that interacts with views.
    // Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module.
    // An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.
    // Makes sure we are specifically accessing the id's from the appropriate xml.
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Prepares binding object and inflates xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Uses the root of the binding object which is the constraint layout
        setContentView(binding?.root)

        // Provides user text once the start button is clicked
        // Once user clicks start button it moves them to the next activity
        binding?.flStart?.setOnClickListener{
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
    }

    // Un-assigns binding to avoid memory leaks
    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}