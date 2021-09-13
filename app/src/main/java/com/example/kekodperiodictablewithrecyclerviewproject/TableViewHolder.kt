package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding

class TableViewHolder(private val binding: AdapterItemElementBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element) {

        binding.element = element

        binding.card.setOnClickListener {
            Toast.makeText(
                binding.root.context,
                "Clicked to ${element.elementFullName}",
                Toast.LENGTH_SHORT
            ).show()
        }


    }

    fun changeVisibility() {

        binding.card.visibility = View.GONE
    }
}