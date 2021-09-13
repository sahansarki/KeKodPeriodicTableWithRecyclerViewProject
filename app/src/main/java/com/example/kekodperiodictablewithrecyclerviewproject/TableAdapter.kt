package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding

class TableAdapter(private val elementList: ArrayList<Element>, private val type: Type) :
    RecyclerView.Adapter<TableViewHolder>() {

    private var line1 = 0
    private var line2_3 = 2


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<AdapterItemElementBinding>(
            inflater,
            R.layout.adapter_item_element,
            parent,
            false
        )

        return TableViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {

        when (type) {
            Type.LINE1 ->
                if (position == 0 || position == 17) {

                    val element = elementList[line1]
                    holder.bind(element)
                    line1++

                    if(position == 17){
                        return
                    }
                } else {
                    holder.changeVisibility()
                }
            Type.LINE2AND3 ->
                if (position < 2 || position > 11) {
                    val element = elementList[line2_3]
                    holder.bind(element)
                    line2_3++
                    if(position == 17) {
                        return
                    }
                } else {

                    holder.changeVisibility()
                }

            Type.LINELAST ->
                if (position in 2..16) {
                    val element = elementList[position]
                    holder.bind(element)
                } else {
                    if(position == 18) {
                        return
                    }
                    holder.changeVisibility()
                }

            else -> {
                if(position == 18) {
                    return
                }
                val element = elementList[position]
                holder.bind(element)
            }


        }


    }

    override fun getItemCount() : Int {
        return 18
    }


}