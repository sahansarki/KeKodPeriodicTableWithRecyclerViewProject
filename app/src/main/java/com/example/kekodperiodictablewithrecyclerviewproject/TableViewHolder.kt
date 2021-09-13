package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding

class TableViewHolder(val binding: AdapterItemElementBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(element: Element) {

        binding.element = element
        //binding.elementShort.text = element.elementShortName

        //val short = itemView.findViewById<TextView>(R.id.element_short)
        //short.text = element.elementShortName

        //binding.apply{
        //  elementShort.text = element.elementShortName
        //}


    }

    fun changeVisibility() {
        itemView.findViewById<CardView>(R.id.card).visibility = View.INVISIBLE
        //binding.card.visibility = View.INVISIBLE
    }
}