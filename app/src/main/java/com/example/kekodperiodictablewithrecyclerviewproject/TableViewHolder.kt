package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TableViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(element: Element) {

        val short = itemView.findViewById<TextView>(R.id.element_short)
        short.text = element.elementShortName

    }
}