package com.wanzz.pgrcharwiki

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MainAdapter
    private lateinit var rvMain: RecyclerView
    private var list: ArrayList<CharModel> = arrayListOf()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecycleView()

        val about: ImageView = findViewById(R.id.about)

        about.setOnClickListener(){
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }

    private fun setupRecycleView() {
        rvMain = findViewById(R.id.rv_main)
        rvMain.setHasFixedSize(true)

        list.addAll(CharData.listData)
        rvMain.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter(list)
        rvMain.adapter = adapter

        adapter.setOnClickListener(object : MainAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val itemChar = list[position]
                val intent = Intent(this@MainActivity, DetailCharacter::class.java)
                intent.putExtra("EXTRA_DATA", itemChar)
                startActivity(intent)
            }
        })
    }

}