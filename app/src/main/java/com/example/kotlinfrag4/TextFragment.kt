package com.example.kotlinfrag4


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class TextFragment : Fragment() {
    var textos: TextView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.textview, container, false)
        textos = view.findViewById(R.id.txtdisp)
        return view
    }

    fun change(txt: String?) {
        textos!!.text = txt
    }
}