package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding

class TableAdapter(private val elementList: ArrayList<Element>, val type: Type) :
    RecyclerView.Adapter<TableViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = AdapterItemElementBinding.inflate(inflater)
        //val itemView = inflater.inflate(R.layout.adapter_item_element, parent, false)
        //val itemView = binding.root.rootView
        return TableViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {

        when (type) {
            Type.LINE1 ->
                if (position == 0 || position == 17) {
                    val element = elementList[position]
                    holder.bind(element)
                } else {
                    holder.changeVisibility()
                }
            Type.LINE2AND3 ->
                if (position < 2 || position > 11) {
                    val element = elementList[position]
                    holder.bind(element)
                } else {
                    holder.changeVisibility()
                }

            Type.LINELAST ->
                if (position in 2..16) {
                    val element = elementList[position]
                    holder.bind(element)
                } else {
                    holder.changeVisibility()
                }

            else -> {
                val element = elementList[position]
                holder.bind(element)
            }


        }


    }

    override fun getItemCount() = elementList.size


}