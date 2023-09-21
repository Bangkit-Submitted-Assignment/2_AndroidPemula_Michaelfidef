package com.klaten.umbulklatenapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvUmbul: RecyclerView
    private val list = ArrayList<Umbul>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUmbul = findViewById(R.id.rv_umbul)
        rvUmbul.setHasFixedSize(true)
        list.addAll(getListHeroes())
        showRecyclerList()
    }

    private fun getListHeroes(): ArrayList<Umbul> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listUmbul = ArrayList<Umbul>()
        for (i in dataName.indices) {
            val umbul = Umbul(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listUmbul.add(umbul)
        }
        return listUmbul
    }

    private fun showRecyclerList() {
        rvUmbul.layoutManager = LinearLayoutManager(this)
        val listUmbulAdapter = ListUmbulAdapter(list)
        rvUmbul.adapter = listUmbulAdapter
    }

    override fun onCreateOptionsMenu(profile1: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, profile1)
        return super.onCreateOptionsMenu(profile1)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page) {
            val moveProfile = Intent(this@MainActivity, profile::class.java)
            startActivity(moveProfile)
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}