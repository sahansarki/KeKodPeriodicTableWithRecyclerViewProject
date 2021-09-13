package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(element: Element) {

        val short = itemView.findViewById<TextView>(R.id.element_short)
        short.text = element.elementShortName

    }

    fun changeVisibility() {
        itemView.findViewById<CardView>(R.id.card).visibility = View.INVISIBLE
    }
}