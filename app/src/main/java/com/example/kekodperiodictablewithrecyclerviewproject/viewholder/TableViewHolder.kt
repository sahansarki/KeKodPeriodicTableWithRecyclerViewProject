package com.example.kekodperiodictablewithrecyclerviewproject.viewholder

import android.app.Dialog
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kekodperiodictablewithrecyclerviewproject.R
import com.example.kekodperiodictablewithrecyclerviewproject.databinding.AdapterItemElementBinding
import com.example.kekodperiodictablewithrecyclerviewproject.model.Element
import eightbitlab.com.blurview.BlurView
import eightbitlab.com.blurview.RenderScriptBlur


class TableViewHolder(
    private val binding: AdapterItemElementBinding,

    ) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(element: Element) {

        binding.element = element

        when (element.elementNo) {
            in 0..2 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.design_default_color_error
                )
            )
            in 3..10 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.purple_500
                )
            )
            in 11..18 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.teal_200
                )
            )
            in 19..36 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.design_default_color_primary_dark
                )
            )
            in 37..54 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.yellow
                )
            )
            in 55..86 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.green
                )

            )
            in 87..118 -> binding.card.setBackgroundColor(
                ContextCompat.getColor(
                    binding.root.context,
                    R.color.pink
                )
            )
        }


        binding.card.setOnClickListener {

            val myDialog = Dialog(binding.root.context)

            //myDialog.window!!.addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)
            myDialog.setContentView(R.layout.custompopup)


            //myDialog.window?.setWindowAnimations(R.style.AnimationForDialog)


            myDialog.findViewById<TextView>(R.id.elementNo).text =
                "Element No = ${element.elementNo}"
            myDialog.findViewById<TextView>(R.id.elementShortName).text =
                "Element Symbol = ${element.elementShortName}"
            myDialog.findViewById<TextView>(R.id.elementLongName).text =
                "Element Name = ${element.elementFullName}"
            myDialog.show()
        }


    }

    fun changeVisibility() {

        binding.card.visibility = View.GONE
    }
}