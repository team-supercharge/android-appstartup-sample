package io.supercharge.appstart.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.startup.AppInitializer
import io.supercharge.appstart.R
import io.supercharge.appstart.libraryA.provider.ClassA_2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init.setOnClickListener {
            AppInitializer.getInstance(this).initializeComponent(ClassA_2::class.java)
        }
    }
}
