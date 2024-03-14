
package com.example.heroesapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.ItemsAdapter
import com.example.heroesapp.models.Item
import com.example.heroesapp.ui.HeroeActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var logoutBtn : ImageButton
    private lateinit var publisherRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        publisherRecyclerView = findViewById(R.id.publisher_recycler_view)
        publisherRecyclerView.adapter = ItemsAdapter(Item.items){ item ->
            val intent = Intent(this, HeroeActivity::class.java).apply {
                putExtra("itemId", item.id)
            }
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.logoutButton)
        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", false)
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}