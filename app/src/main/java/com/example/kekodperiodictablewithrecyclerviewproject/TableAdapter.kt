package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TableAdapter(private val elementList: ArrayList<Element>, val type: Type) :
    RecyclerView.Adapter<TableViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.adapter_item_element, parent, false)

        return TableViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {

        when (type) {
            Type.LINE1 ->
                if (position == 0 || position == 17) {
                    val element = elementList[position]
                    holder.bind(element)
                }
            Type.LINE2AND3 ->
                if (position < 2 || position > 11) {
                    val element = elementList[position]
                    holder.bind(element)
                }

            else -> {
                val element = elementList[position]
                holder.bind(element)
            }


        }


    }

    override fun getItemCount() = elementList.size


}