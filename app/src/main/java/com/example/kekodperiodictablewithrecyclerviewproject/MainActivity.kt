package com.example.kekodperiodictablewithrecyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter1 = TableAdapter(DummyData.createElementList(),Type.LINE1)
        val adapter2_3 = TableAdapter(DummyData.createElementList(),Type.LINE2AND3)
        val adapter3 = TableAdapter(DummyData.createElementList(),Type.LINEREST)

        findViewById<RecyclerView>(R.id.rc_table1).adapter = adapter1
        findViewById<RecyclerView>(R.id.rc_table2).adapter = adapter2_3
        findViewById<RecyclerView>(R.id.rc_table3).adapter = adapter2_3
        findViewById<RecyclerView>(R.id.rc_table4).adapter = adapter3
        findViewById<RecyclerView>(R.id.rc_table5).adapter = adapter3
        findViewById<RecyclerView>(R.id.rc_table6).adapter = adapter3
        findViewById<RecyclerView>(R.id.rc_table7).adapter = adapter3
        findViewById<RecyclerView>(R.id.rc_table8).adapter = adapter3

        findViewById<RecyclerView>(R.id.rc_table1).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table2).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table3).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table4).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table5).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table6).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table7).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
        findViewById<RecyclerView>(R.id.rc_table8).layoutManager = GridLayoutManager(this,1,RecyclerView.HORIZONTAL,false)
    }
}