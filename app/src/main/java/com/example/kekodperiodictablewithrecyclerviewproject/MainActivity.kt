package com.example.kekodperiodictablewithrecyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter1 = TableAdapter(DummyData.createElementFor1(), Type.LINE1)
        val adapter2 = TableAdapter(DummyData.createElementFor2(), Type.LINE2AND3)
        val adapter3 = TableAdapter(DummyData.createElementFor3(), Type.LINE2AND3)
        val adapter4 = TableAdapter(DummyData.createElementFor4(), Type.LINEREST)
        val adapter5 = TableAdapter(DummyData.createElementFor5(), Type.LINEREST)
        val adapter6 = TableAdapter(DummyData.createElementFor6(), Type.LINEREST)
        val adapter7 = TableAdapter(DummyData.createElementFor7(), Type.LINEREST)
        val adapter8 = TableAdapter(DummyData.createElementFor8(), Type.LINELAST)
        val adapter9 = TableAdapter(DummyData.createElementFor9(), Type.LINELAST)

        val rc1 = binding.rcTable1
        val rc2 = binding.rcTable2
        val rc3 = binding.rcTable3
        val rc4 = binding.rcTable4
        val rc5 = binding.rcTable5
        val rc6 = binding.rcTable6
        val rc7 = binding.rcTable7
        val rc8 = binding.rcTable8
        val rc9 = binding.rcTable9

        rc1.adapter = adapter1
        rc2.adapter = adapter2
        rc3.adapter = adapter3
        rc4.adapter = adapter4
        rc5.adapter = adapter5
        rc6.adapter = adapter6
        rc7.adapter = adapter7
        rc8.adapter = adapter8
        rc9.adapter = adapter9

        rc1.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc2.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc3.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc4.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc5.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc6.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc7.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc8.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
        rc9.layoutManager = GridLayoutManager(this, 18, RecyclerView.VERTICAL, false)
    }
}