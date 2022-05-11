package com.example.kotlinfrag4



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment


class ItemListFragment : Fragment() {
    var AndroidOS = arrayOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice Cream SandWich",
        "Jelly Bean",
        "KitKat",
        "LolliPop",
        "MarshMallow",
        "Nougat",
        "Oreo"
    )
  lateinit  var lv: ListView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.listview, container, false)
        lv = view.findViewById<View>(R.id.lst) as ListView
        val adapter = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_list_item_1,
            AndroidOS
        )
        lv.setAdapter(adapter)
        lv.setOnItemClickListener(OnItemClickListener { adapterView, view, i, l ->
            val txtfrag =  getParentFragmentManager().findFragmentById(R.id.fragment2) as TextFragment?
            txtfrag!!.change("Android OS:-" + AndroidOS[i])
            lv.setSelector(R.color.holo_blue_dark)
        })
        return view
    }
}
