package com.example.kekodperiodictablewithrecyclerviewproject

object DummyData {

    fun createElementList(): ArrayList<Element> {
        val elements = ArrayList<Element>()

        for (i in 1..18) {
            val element = Element(1, "K", "Hidrojen")
            elements.add(element)
        }

        return elements

    }
}