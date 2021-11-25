package com.example.remindeme

import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*


class MainActivity : AppCompatActivity() {
    var mCreateRem: FloatingActionButton? = null
    var mRecyclerview: RecyclerView? = null
    var dataholder: ArrayList<Model> =ArrayList<Model>()
    var adapter: myAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerview = findViewById<View>(R.id.recyclerView) as RecyclerView
        mRecyclerview!!.layoutManager = LinearLayoutManager(applicationContext)

        registerForContextMenu(mRecyclerview)

        mCreateRem =
            findViewById<View>(R.id.create_reminder) as FloatingActionButton
        mCreateRem!!.setOnClickListener {
            val intent = Intent(applicationContext, ReminderActivity::class.java)
            startActivity(intent)
        }
        val cursor =
            dbManager(applicationContext).readallreminders()
        while (cursor.moveToNext()) {
            val model = Model(cursor.getString(1), cursor.getString(2), cursor.getString(3))
            dataholder.add(model)
        }
        adapter = myAdapter(dataholder)
        mRecyclerview!!.adapter = adapter
    }
}