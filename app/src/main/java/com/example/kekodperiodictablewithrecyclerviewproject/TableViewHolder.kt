package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding

class TableViewHolder(val binding: AdapterItemElementBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element) {

        binding.element = element


    }

    fun changeVisibility() {

        binding.card.visibility = View.GONE
    }
}