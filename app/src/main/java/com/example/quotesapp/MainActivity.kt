package com.example.quotesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ShayariAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val shayariList = listOf(
            Shayari(1, "तुमसे मिलकर ख़ुशबू सी आई है,\nतेरे बिना ये ज़िन्दगी अधूरी सी लगती है।", "अज्ञात"),
            Shayari(2, "इश्क़ का इरादा तो कर लिया था,\nपर तुमसे मिलने की हिम्मत नहीं हो रही।", "अज्ञात"),
            // Add more Shayaris here
        )

        adapter = ShayariAdapter(shayariList)
        recyclerView.adapter = adapter
    }
}
