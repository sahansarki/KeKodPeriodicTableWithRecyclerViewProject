package com.example.kekodperiodictablewithrecyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding


class TableAdapter(private val elementList: ArrayList<Element>, private val type: Type) :
    RecyclerView.Adapter<TableViewHolder>() {

    private var i = 0


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = DataBindingUtil.inflate<AdapterItemElementBinding>(
            inflater,
            R.layout.adapter_item_element,
            parent,
            false
        )

        //val bindingPop = CustompopupBinding.inflate(LayoutInflater.from(parent.context))

        //val bindingPop = DataBindingUtil.inflate<CustompopupBinding>(inflater,R.layout.custompopup,null,false)

        return TableViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {

        when (type) {
            Type.LINE1 ->
                if (position == 0 || position == 17) {

                    val element = elementList[i]
                    holder.bind(element)
                    i++

                    if (position == 17) {
                        return
                    }
                } else {
                    holder.changeVisibility()
                }
            Type.LINE2AND3 ->
                if (position < 2 || position > 11) {
                    val element = elementList[i]
                    holder.bind(element)
                    i++
                    if (position == 17) {
                        return
                    }
                } else {

                    holder.changeVisibility()
                }

            Type.LINEREST ->
                if (position < 18) {
                    val element = elementList[i]
                    holder.bind(element)
                    i++
                    if (position == 17) {
                        return
                    }
                }


            Type.LINELAST ->
                if (position in 2..16) {
                    val element = elementList[i]
                    holder.bind(element)
                    i++

                    if (position == 17) {
                        return
                    }
                } else {

                    holder.changeVisibility()
                }


        }


    }

    override fun getItemCount(): Int {
        return 18
    }


}